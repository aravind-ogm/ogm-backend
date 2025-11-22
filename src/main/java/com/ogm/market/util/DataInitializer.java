package com.ogm.market.util;

import com.ogm.market.model.Property;
import com.ogm.market.repository.PropertyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataInitializer implements CommandLineRunner {

    private final PropertyRepository repo;

    public DataInitializer(PropertyRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) throws Exception {

        if (repo.count() > 0) return;

        // ------------------------- PROPERTY 1 -------------------------
        Property p1 = Property.builder().title("Premium 4BHK Villa in Whitefield").location("Prestige Glenmore Estates, Whitefield, Bengaluru").price("₹3.85 Cr").type("Independent Villa").sqft("4500").reraApproved(true).image("/images/villa_main_1.jpg").mainImages(Arrays.asList("/images/villa_main_1.jpg", "/images/villa_main_2.jpg", "/images/villa_main_3.jpg")).images(Arrays.asList("/images/villa1.jpg", "/images/villa2.jpg", "/images/villa3.jpg", "/images/villa4.jpg", "/images/villa5.jpg", "/images/villa6.jpg", "/images/villa7.jpg")).bedrooms(4).bathrooms(5).carpetArea("3200 sq.ft").builtupArea("4500 sq.ft").parking("3 Cars").maintenance("₹8,500").furnishing("Semi-Furnished").facing("East").description("An ultra-premium 4BHK villa with Italian marble flooring, dedicated servant room, full vastu compliance, and a lush private garden.").videoUrl("/videos/villa_tour_1.mp4").amenities(Arrays.asList("3-Phase Power Backup", "24x7 Water Supply", "Gated Community Security", "Covered Car Parking", "Clubhouse & Gym", "Swimming Pool", "Landscaped Garden", "Children Play Area", "High-Speed Internet Ready", "Solar Water Heater", "Modular Kitchen", "Vitrified Tile Flooring")).build();

        // ------------------------- PROPERTY 2 -------------------------
        Property p2 = Property.builder().title("Skyline 5BHK Penthouse – Indiranagar").location("Indiranagar 100 Ft Road, Bengaluru").price("₹5.6 Cr").type("Penthouse").sqft("5200").reraApproved(true).image("/images/penthouse_main_1.jpg").mainImages(Arrays.asList("/images/penthouse_main_1.jpg", "/images/penthouse_main_2.jpg", "/images/penthouse_main_3.jpg")).images(Arrays.asList("/images/penthouse1.jpg", "/images/penthouse2.jpg")).bedrooms(5).bathrooms(6).carpetArea("3800 sq.ft").builtupArea("5200 sq.ft").parking("3 Cars").maintenance("₹12,000").furnishing("Fully Furnished").facing("North-East").description("An ultra-luxurious penthouse with an open deck, skyline views, infinity jacuzzi, and German modular kitchen.").videoUrl("/videos/penthouse_tour.mp4").amenities(Arrays.asList("3-Phase Power Backup", "24x7 Water Supply", "Gated Community Security", "Covered Car Parking", "Clubhouse & Gym", "Swimming Pool", "Landscaped Garden", "Children Play Area", "High-Speed Internet Ready", "Solar Water Heater", "Modular Kitchen", "Vitrified Tile Flooring")).build();

        // ------------------------- PROPERTY 3 -------------------------
        Property p3 = Property.builder().title("Premium 3BHK Apartment – Sarjapur Road").location("DS-Max Sapphire, Sarjapur Road, Bengaluru").price("₹1.65 Cr").type("Apartment").sqft("1760").reraApproved(false).image("/images/apartment_main_1.jpg").mainImages(Arrays.asList("/images/apartment_main_1.jpg", "/images/apartment_main_2.jpg")).images(Arrays.asList("/images/apartment1.jpg", "/images/apartment2.jpg", "/images/apartment3.jpg")).bedrooms(3).bathrooms(3).carpetArea("1280 sq.ft").builtupArea("1760 sq.ft").parking("2 Cars").maintenance("₹4,000").furnishing("Unfurnished").facing("West").description("Strategically located 3BHK apartment with clubhouse, swimming pool, kids play area, and 24/7 security.").videoUrl("/videos/apartment_tour.mp4").amenities(Arrays.asList("3-Phase Power Backup", "24x7 Water Supply", "Gated Community Security", "Covered Car Parking", "Clubhouse & Gym", "Swimming Pool", "Landscaped Garden", "Children Play Area", "High-Speed Internet Ready", "Solar Water Heater", "Modular Kitchen", "Vitrified Tile Flooring")).build();

        // ------------------------- PROPERTY 4 -------------------------
        Property p4 = Property.builder().title("Premium Gated Villa Plot – Devanahalli").location("Brigade Orchards, Devanahalli, Bengaluru").price("₹95 Lakhs").type("Plot").sqft("2400").reraApproved(true).image("/images/plot_main_1.jpg").mainImages(Arrays.asList("/images/plot_main_1.jpg", "/images/plot_main_2.jpg")).images(Arrays.asList("/images/plot1.jpg", "/images/plot2.jpg")).bedrooms(0).bathrooms(0).carpetArea("N/A").builtupArea("N/A").parking("N/A").maintenance("₹1 / Sqft").furnishing("N/A").facing("Any").description("Premium 40x60 villa plot in a RERA-approved integrated township with 100+ amenities.").videoUrl("/videos/plot_tour.mp4").amenities(Arrays.asList("3-Phase Power Backup", "24x7 Water Supply", "Gated Community Security", "Covered Car Parking", "Clubhouse & Gym", "Swimming Pool", "Landscaped Garden", "Children Play Area", "High-Speed Internet Ready", "Solar Water Heater", "Modular Kitchen", "Vitrified Tile Flooring")).build();

        // ------------------------- PROPERTY 5 -------------------------
        Property p5 = Property.builder().title("Fully Furnished Studio – Electronic City").location("Ajmera Silicon Valley, Electronic City Phase 1").price("₹42 Lakhs").type("Studio").sqft("620").reraApproved(false).image("/images/studio_main_1.jpg").mainImages(Arrays.asList("/images/studio_main_1.jpg", "/images/studio_main_2.jpg")).images(Arrays.asList("/images/studio1.jpg", "/images/studio2.jpg")).bedrooms(1).bathrooms(1).carpetArea("480 sq.ft").builtupArea("620 sq.ft").parking("1 Car").maintenance("₹2,000").furnishing("Fully Furnished").facing("South").description("Ideal for bachelors and young working professionals near major IT parks with all modern amenities.").videoUrl("/videos/studio_tour.mp4").amenities(Arrays.asList("3-Phase Power Backup", "24x7 Water Supply", "Gated Community Security", "Covered Car Parking", "Clubhouse & Gym", "Swimming Pool", "Landscaped Garden", "Children Play Area", "High-Speed Internet Ready", "Solar Water Heater", "Modular Kitchen", "Vitrified Tile Flooring")).build();

        repo.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
        System.out.println("✔ Sample properties loaded successfully.");
    }
}
