package com.ogm.market.controller;

import com.ogm.market.model.ContactForm;
import com.ogm.market.service.EmailService;
import jakarta.mail.MessagingException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "${app.cors.allowed-origins:http://localhost:3000}")
public class ContactController {

    private final EmailService emailService;

    public ContactController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestBody ContactForm form) {
        try {
            emailService.sendContactEmail(form);
            return ResponseEntity.ok("Email sent successfully");
        } catch (MessagingException ex) {
            // log the error (use a logger in real code)
            ex.printStackTrace();
            return ResponseEntity.status(500).body("Failed to send email: " + ex.getMessage());
        }
    }
}
