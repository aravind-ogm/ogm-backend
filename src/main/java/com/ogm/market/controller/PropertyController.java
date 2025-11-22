package com.ogm.market.controller;

import com.ogm.market.dto.PropertyRequest;
import com.ogm.market.dto.PropertyResponse;
import com.ogm.market.service.PropertyService;
import com.ogm.market.service.StorageService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin(origins = "${app.cors.allowed-origins:http://localhost:3000}")
@RequestMapping("/api/properties")
public class PropertyController {

    private final PropertyService propertyService;
    private final StorageService storageService;

    public PropertyController(PropertyService propertyService,
                              StorageService storageService) {
        this.propertyService = propertyService;
        this.storageService = storageService;
    }

    // -------------------- ADVANCED SEARCH --------------------
    @GetMapping
    public Page<PropertyResponse> search(
            @RequestParam(required = false) String q,
            @RequestParam(required = false) String type,
            @RequestParam(required = false) Long minPrice,
            @RequestParam(required = false) Long maxPrice,
            @RequestParam(required = false) Integer minSqft,
            @RequestParam(required = false) Integer maxSqft,
            @RequestParam(required = false) Boolean rera,
            @RequestParam(required = false) Integer bhk,
            @RequestParam(required = false) String facing,
            @RequestParam(required = false) String furnishing,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "12") int size
    ) {
        Pageable pageable = PageRequest.of(page, size);

        return propertyService.listProperties(
                q, type, minPrice, maxPrice,
                minSqft, maxSqft, rera, bhk, facing, furnishing,
                pageable
        );
    }

    // -------------------- GET BY ID --------------------
    @GetMapping("/{id}")
    public PropertyResponse getProperty(@PathVariable Long id) {
        return propertyService.getProperty(id);
    }

    // -------------------- CREATE --------------------
    @PostMapping
    public ResponseEntity<PropertyResponse> createProperty(@RequestBody PropertyRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(propertyService.createProperty(request));
    }

    // -------------------- UPDATE --------------------
    @PutMapping("/{id}")
    public PropertyResponse updateProperty(
            @PathVariable Long id,
            @RequestBody PropertyRequest request
    ) {
        return propertyService.updateProperty(id, request);
    }

    // -------------------- DELETE --------------------
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProperty(@PathVariable Long id) {
        propertyService.deleteProperty(id);
        return ResponseEntity.noContent().build();
    }

    // -------------------- UPLOAD IMAGES --------------------
    @PostMapping("/{id}/upload-image")
    public ResponseEntity<String> uploadImage(
            @PathVariable Long id,
            @RequestParam("file") MultipartFile file
    ) {
        String path = storageService.store(file, "properties/" + id);
        return ResponseEntity.ok(path);
    }

    @PostMapping("/{id}/upload-images")
    public ResponseEntity<List<String>> uploadImages(
            @PathVariable Long id,
            @RequestParam("files") List<MultipartFile> files
    ) {
        List<String> paths = storageService.storeMultiple(files, "properties/" + id);
        return ResponseEntity.ok(paths);
    }

    // -------------------- UPLOAD VIDEO --------------------
    @PostMapping("/{id}/upload-video")
    public ResponseEntity<String> uploadVideo(
            @PathVariable Long id,
            @RequestParam("file") MultipartFile file
    ) {
        String path = storageService.store(file, "properties/" + id + "/video");
        return ResponseEntity.ok(path);
    }
}
