package com.ogm.market.controller;

import com.ogm.market.dto.BrochureRequest;
import com.ogm.market.service.BrochureService;
import com.ogm.market.service.EmailService;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.nio.file.Path;
import java.util.Map;

@RestController
@RequestMapping("/api/brochure")
@CrossOrigin(origins = "${app.cors.allowed-origins:http://localhost:3000}")
public class BrochureController {

    private final BrochureService brochureService;
    private final EmailService emailService; // optional: to notify admin

    public BrochureController(BrochureService brochureService, EmailService emailService) {
        this.brochureService = brochureService;
        this.emailService = emailService;
    }

    /**
     * Request a brochure for a property (called by the frontend form)
     * Returns a JSON with a download URL. The frontend will then navigate to that URL to start the download.
     */
    @PostMapping("/request")
    public ResponseEntity<Map<String, String>> requestBrochure(@RequestBody BrochureRequest req) {
        // Basic validation
        if (req.getName() == null || req.getName().trim().isEmpty()) {
            return ResponseEntity.badRequest().body(Map.of("error", "Name required"));
        }
        if (req.getMobile() == null || req.getMobile().trim().isEmpty()) {
            return ResponseEntity.badRequest().body(Map.of("error", "Mobile required"));
        }

        // Record request (DB/analytics) - optional
        brochureService.recordRequest(req);

        // Optionally notify admin via email (uncomment if you have a method in EmailService)
        try {
            String subject = "Brochure request for property " + req.getPropertyId();
            String body = "Name: " + req.getName() + "\nMobile: " + req.getMobile() + "\nEmail: " + req.getEmail();
            // emailService.sendSimpleEmail("admin@yourdomain.com", subject, body);
        } catch (Exception ex) {
            // log & continue - do not block download
            ex.printStackTrace();
        }

        // Returning a download URL that points to the streaming endpoint below
        String downloadUrl = "/api/brochure/download?file=ogm-brochure.pdf";
        return ResponseEntity.ok(Map.of("url", downloadUrl));
    }

    /**
     * Streams the PDF file so the browser downloads it with proper headers.
     * Expects 'file' parameter which maps to a server file (for safety we only allow the known filename).
     */
    @GetMapping("/download")
    public ResponseEntity<?> downloadBrochure(@RequestParam("file") String file) {
        // Restrict to known filename to avoid path traversal
        if (!"ogm-brochure.pdf".equals(file)) {
            return ResponseEntity.badRequest().body(Map.of("error", "Invalid file"));
        }

        try {
            Path path = brochureService.getBrochurePath();
            if (!path.toFile().exists()) {
                return ResponseEntity.notFound().build();
            }

            InputStreamResource resource = new InputStreamResource(new FileInputStream(path.toFile()));

            HttpHeaders headers = new HttpHeaders();
            headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + path.getFileName().toString());
            headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_PDF_VALUE);

            return ResponseEntity.ok()
                    .headers(headers)
                    .contentLength(path.toFile().length())
                    .contentType(MediaType.APPLICATION_PDF)
                    .body(resource);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body(Map.of("error", "File not found"));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResponseEntity.status(500).body(Map.of("error", "Server error"));
        }
    }
}
