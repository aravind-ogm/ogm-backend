package com.ogm.market.controller;

import com.ogm.market.model.Property;
import com.ogm.market.service.PropertyService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/properties")
public class PropertyController {

    private final PropertyService service;

    public PropertyController(PropertyService service) {
        this.service = service;
    }

    @GetMapping
    public List<Property> getProperties() {
        return service.getAllProperties();
    }
}
