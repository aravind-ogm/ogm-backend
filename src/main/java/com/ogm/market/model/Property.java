package com.ogm.market.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String location;
    private String price;
    private String image;

    private String type;
    private String sqft;
    private boolean reraApproved;

    public Property(Long id, String title, String location, String price, String image,
                    String type, String sqft, boolean reraApproved) {
        this.id = id;
        this.title = title;
        this.location = location;
        this.price = price;
        this.image = image;
        this.type = type;
        this.sqft = sqft;
        this.reraApproved = reraApproved;
    }

    public Property() {}

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getPrice() { return price; }
    public void setPrice(String price) { this.price = price; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getSqft() { return sqft; }
    public void setSqft(String sqft) { this.sqft = sqft; }

    public boolean isReraApproved() { return reraApproved; }
    public void setReraApproved(boolean reraApproved) { this.reraApproved = reraApproved; }
}
