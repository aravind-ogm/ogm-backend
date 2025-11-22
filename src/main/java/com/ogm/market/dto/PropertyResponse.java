package com.ogm.market.dto;

import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
public class PropertyResponse {

    private Long id;
    private String title;
    private String location;
    private String price;

    private String image;
    private String type;
    private String sqft;
    private boolean reraApproved;

    private List<String> mainImages;   // ⭐ NEW — homepage carousel images
    private List<String> amenities;    // ⭐ NEW — features & amenities

    private List<String> images;       // gallery images

    private Integer bedrooms;
    private Integer bathrooms;

    private String carpetArea;
    private String builtupArea;
    private String parking;
    private String maintenance;
    private String facing;
    private String furnishing;

    private String description;
    private String videoUrl;
}
