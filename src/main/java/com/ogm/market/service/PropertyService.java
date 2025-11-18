package com.ogm.market.service;

import com.ogm.market.model.Property;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PropertyService {

    public List<Property> getAllProperties() {
        return Arrays.asList(new Property(1L, "Modern Apartment", "Whitefield, Bengaluru", "₹75 Lakhs", "/images/prop1.jpg", "Apartment", "1200", true), new Property(2L, "Luxury Villa", "Koramangala, Bengaluru", "₹2.1 Cr", "/images/prop2.jpg", "Villa", "2800", true), new Property(3L, "3BHK Premium Flat", "Indiranagar, Bengaluru", "₹1.5 Cr", "/images/prop3.jpg", "Flat", "1600", false), new Property(4L, "Ultra Luxury Penthouse", "Hebbal, Bengaluru", "₹3.5 Cr", "/images/prop4.jpg", "Penthouse", "3100", true));
    }

}
