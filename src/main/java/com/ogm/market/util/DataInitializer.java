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

        Property p1 = Property.builder()
                .title("Singapore Style 4 BHK Villa in Gattahalli")
                .location("Astro Green Cascade, Gattahalli, Bengaluru")
                .price("₹7 Cr")
                .type("Residential Building")
                .sqft("4300")
                .reraApproved(true)
                .brochureFile("property-1.pdf")
                .image("/images/p1/property-01-main-01.jpg")
                .mainImages(Arrays.asList(
                        "/images/p1/property-01-main-01.jpg",
                        "/images/p1/property-01-main-01.jpg"
                ))
                .images(Arrays.asList(
                        "/images/p1/property-01-gallery-01.jpg", "/images/p1/property-01-gallery-02.jpg", "/images/p1/property-01-gallery-03.jpg", "/images/p1/property-01-gallery-04.jpg", "/images/p1/property-01-gallery-05.jpg",
                        "/images/p1/property-01-gallery-06.jpg", "/images/p1/property-01-gallery-07.jpg", "/images/p1/property-01-gallery-08.jpg", "/images/p1/property-01-gallery-09.jpg"
                ))
//                .bedrooms(4)
//                .bathrooms(5)
                .carpetArea("2400 sq.ft")
                .builtupArea("4300 sq.ft")
                .parking("3 Cars")
                .furnishing("Un-furnished")
                .facing("East")
                .description("This villa blends modern luxury with natural serenity, featuring sunlit interiors, landscaped pockets and a seamless flow of spaces across all three levels. Each floor is thoughtfully designed—from a warm, open ground level to a private, lounge-style first floor and a retreat-like second floor with a media room and terrace. With its lift, elegant staircase and well-crafted rooms, the home offers a calm, elevated living experience that feels both refined and effortlessly inviting.")
                .videoUrl("/images/p1/property-01-video-01.mp4")
                .amenities(Arrays.asList(
                        "Car Parking (2 car parking slots)",
                        "Indoor Garden / Courtyard",
                        "Dining Area",
                        "Kitchen",
                        "Utility Area",
                        "Powder Room / Toilet",
                        "Indoor Lift (5-person lift)",
                        "Spiral Staircase",
                        "Living Room / Family Lounge",
                        "Indoor Garden / Open-to-sky area",
                        "Media Room / Entertainment Zone",
                        "Pooja Room",
                        "Large Terraces Sit-out Area"
                ))

                .build();

        // ------------------------- PROPERTY 2 -------------------------

        Property p2 = Property.builder()
                .title("2 & 3 BHK Flats in Kasavanahalli")
                .location("Kasavanhalli , Bengaluru, ( Near hsr layout )")
                .price("₹1.25 Cr")
                .type("Residential Building")
                .sqft("1569")
                .reraApproved(true)
                .brochureFile("property-2.pdf")
                .image("/images/p2/property-02-main-01.jpeg")
                .mainImages(Arrays.asList(
                        "/images/p2/property-02-main-01.jpeg",
                        "/images/p2/property-02-main-01.jpeg",
                        "/images/p2/property-02-main-01.jpeg"
                ))
                .images(Arrays.asList(
                        "/images/p2/property-02-gallery-01.jpeg", "/images/p2/property-02-gallery-02.jpeg", "/images/p2/property-02-gallery-03.jpeg",
                        "/images/p2/property-02-gallery-04.jpeg", "/images/p2/property-02-gallery-05.jpeg", "/images/p2/property-02-gallery-06.jpeg",
                        "/images/p2/property-02-gallery-07.jpeg", "/images/p2/property-02-gallery-08.jpeg", "/images/p2/property-02-gallery-09.jpeg",
                        "/images/p2/property-02-gallery-10.jpeg", "/images/p2/property-02-gallery-11.jpeg", "/images/p2/property-02-gallery-12.jpeg"
                ))
                .bedrooms(5)
                .bathrooms(5)
                .carpetArea("N/A")
                .builtupArea("1569 sq.ft")
                .parking("Ground Floor Car Parking")
                .maintenance("N/A")
                .furnishing("Un-Furnished")
                .facing("East")
                .description("Living in this residence feels effortlessly balanced, with well-planned 2BHK and 3BHK homes arranged around generous passages and open internal courtyards that bring light into everyday life. Each apartment offers a sense of privacy while still feeling connected to the rhythm of a thoughtfully designed community. The experience is calm, convenient, and quietly elevated—perfect for a lifestyle that values both comfort and space.")
                .videoUrl("/videos/p2_house_tour.mp4")
                .amenities(Arrays.asList(
                        "Kids Play Area", "Club House/Party Hall", "Gymnasium"
                ))
                .build();

        // ------------------------- PROPERTY 3 -------------------------

        Property p3 = Property.builder()
                .title("2 BHK Flats in Junnasandra")
                .location("Junnasandra, Near Old Wipro Gate, Bengaluru")
                .price("₹40 Lakhs")
                .type("Residential Building")
                .sqft("1100")
                .reraApproved(true)
                .soldOut(true)
                .image("/images/p3/property-03-main-01.jpg")
                .mainImages(Arrays.asList(
                        "/images/p3/property-03-main-01.jpg",
                        "/images/p3/property-03-main-01.jpg"
                ))
                .images(Arrays.asList(
                        "/images/p3/property-03-gallery-01.jpg", "/images/p3/property-03-gallery-02.jpg", "/images/p3/property-03-gallery-03.jpg",
                        "/images/p3/property-03-gallery-04.jpg", "/images/p3/property-03-gallery-05.jpg", "/images/p3/property-03-gallery-06.jpg",
                        "/images/p3/property-03-gallery-07.jpg", "/images/p3/property-03-gallery-08.jpg", "/images/p3/property-03-gallery-09.jpg",
                        "/images/p3/property-03-gallery-10.jpg", "/images/p3/property-03-gallery-11.jpg"
                ))
                .bedrooms(3)
                .bathrooms(3)
                .carpetArea("1100 sq.ft")
                .builtupArea("1100 sq.ft")
                .parking("2 Cars")
                .maintenance("N/A")
                .furnishing("Unfurnished")
                .facing("East & North")
                .description("Living in this residence feels effortlessly balanced, with well-planned 2BHK and 3BHK homes arranged around generous passages and open internal courtyards that bring light into everyday life. Each apartment offers a sense of privacy while still feeling connected to the rhythm of a thoughtfully designed community. The experience is calm, convenient, and quietly elevated—perfect for a lifestyle that values both comfort and space.")
                .videoUrl("/videos/apartment_tour.mp4")
                .amenities(Arrays.asList(
                        "Kids Play Area", "Club House/Party Hall", "Gymnasium"
                ))
                .build();

        // ------------------------- PROPERTY 4 -------------------------

        Property p4 = Property.builder()
                .title("2 BHK in Sobha Dream Acres ")
                .location("Sobha Dream Acres, Varthur, Bengaluru")
                .price("₹75.5 Lakhs")
                .type("Large Community Building")
                .sqft("1012")
                .reraApproved(true)
                .soldOut(true)
                .image("/images/p4/property-04-main-01.jpg")
                .mainImages(Arrays.asList(
                        "/images/p4/property-04-main-01.jpg",
                        "/images/p4/property-04-main-01.jpg"
                ))
                .images(Arrays.asList(
                        "/images/p4/property-04-gallery-01.jpg", "/images/p4/property-04-gallery-02.jpg", "/images/p4/property-04-gallery-03.jpg", "/images/p4/property-04-gallery-04.jpg",
                        "/images/p4/property-04-gallery-05.jpg", "/images/p4/property-04-gallery-06.jpg", "/images/p4/property-04-gallery-07.jpg", "/images/p4/property-04-gallery-08.jpg"
                ))
                .bedrooms(0)
                .bathrooms(0)
                .carpetArea("N/A")
                .builtupArea("N/A")
                .parking("N/A")
                .maintenance("N/A")
                .furnishing("Furnished")
                .facing("East")
                .description(": Living in a 2 BHK flat at Sobha Dream Acres in Bengaluru means waking up each day to lush green surroundings, wide open spaces and well-maintained landscaping that give a refreshing, calm vibe to everyday life. With access to a rich set of amenities — swimming pools, multiple clubhouses, gym, sports courts, jogging and cycling tracks, children’s play areas, guest rooms and more — there’s always something for relaxation, fitness or social time right at your doorstep. All this, combined with good connectivity to the city and thoughtfully designed flats, makes living here feel comfortable, convenient and community-oriented.")
                .videoUrl("/videos/plot_tour.mp4")
                .amenities(Arrays.asList(
                        "Club House",
                        "Swimming Pool",
                        "Kids Play Area",
                        "Tennis Court",
                        "Volleyball Court",
                        "Basketball Court",
                        "Gym",
                        "Co-working Space",
                        "Supermarket",
                        "Guest Rooms",
                        "Bowling Alley",
                        "Yoga",
                        "Billiards",
                        "Cycle Track",
                        "Badminton Court",
                        "Jogging Track",
                        "Landscaped Garden",
                        "Spa & Sauna",
                        "Party Hall",
                        "Outdoor Sports"
                ))
                .build();

        // ------------------------- PROPERTY 5 -------------------------

        Property p5 = Property.builder()
                .title("Dummy2 – Electronic City")
                .location("Ajmera Silicon Valley, Electronic City Phase 1")
                .price("₹42 Lakhs")
                .type("Studio")
                .sqft("620")
                .reraApproved(false)
                .image("/images/p5/property-05-main-01.jpg")
                .mainImages(Arrays.asList(
                        "/images/p5/property-05-main-01.jpg",
                        "/images/p5/property-05-main-01.jpg"
                ))
                .images(Arrays.asList(
                        "/images/p5/property-05-gallery-01.jpg", "/images/p5/property-05-gallery-01.jpg", "/images/p5/property-05-gallery-01.jpg", "/images/p5/property-05-gallery-01.jpg",
                        "/images/p5/property-05-gallery-01.jpg", "/images/p5/property-05-gallery-01.jpg", "/images/p5/property-05-gallery-01.jpg", "/images/p5/property-05-gallery-01.jpg"
                ))
                .bedrooms(1)
                .bathrooms(1)
                .carpetArea("480 sq.ft")
                .builtupArea("620 sq.ft")
                .parking("1 Car")
                .maintenance("₹2,000")
                .furnishing("Fully Furnished")
                .facing("South")
                .description("Ideal for bachelors and young working professionals near major IT parks with all modern amenities.")
                .videoUrl("/videos/studio_tour.mp4")
                .amenities(Arrays.asList(
                        "3-Phase Power Backup", "24x7 Water Supply", "Gated Community Security",
                        "Covered Car Parking", "Clubhouse & Gym", "Swimming Pool",
                        "Landscaped Garden", "Children Play Area", "High-Speed Internet Ready",
                        "Solar Water Heater", "Modular Kitchen", "Vitrified Tile Flooring"
                ))
                .build();

        // ------------------------- PROPERTY 6 -------------------------

        Property p6 = Property.builder()
                .title("Skyline 5BHK Penthouse – Indiranagar")
                .location("Indiranagar 100 Ft Road, Bengaluru")
                .price("₹5.6 Cr")
                .type("Penthouse")
                .sqft("5200")
                .reraApproved(true)
                .image("/images/p6/property-06-main-01.jpg")
                .mainImages(Arrays.asList(
                        "/images/p6/property-06-main-01.jpg",
                        "/images/p6/property-06-main-01.jpg"
                ))
                .images(Arrays.asList(
                        "/images/p6/property-06-gallery-01.jpg", "/images/p6/property-06-gallery-01.jpg", "/images/p6/property-06-gallery-01.jpg", "/images/p6/property-06-gallery-01.jpg",
                        "/images/p6/property-06-gallery-01.jpg", "/images/p6/property-06-gallery-01.jpg", "/images/p6/property-06-gallery-01.jpg", "/images/p6/property-06-gallery-01.jpg"
                ))
                .bedrooms(5)
                .bathrooms(6)
                .carpetArea("3800 sq.ft")
                .builtupArea("5200 sq.ft")
                .parking("3 Cars")
                .maintenance("₹12,000")
                .furnishing("Fully Furnished")
                .facing("North-East")
                .description("An ultra-luxurious penthouse with an open deck, skyline views, infinity jacuzzi, and German modular kitchen.")
                .videoUrl("/videos/penthouse_tour.mp4")
                .amenities(Arrays.asList(
                        "3-Phase Power Backup", "24x7 Water Supply", "Gated Community Security",
                        "Covered Car Parking", "Clubhouse & Gym", "Swimming Pool",
                        "Landscaped Garden", "Children Play Area", "High-Speed Internet Ready",
                        "Solar Water Heater", "Modular Kitchen", "Vitrified Tile Flooring"
                ))
                .build();

        // ------------------------- PROPERTY 7 -------------------------

        Property p7 = Property.builder()
                .title("Premium 3BHK Apartment – Sarjapur Road")
                .location("DS-Max Sapphire, Sarjapur Road, Bengaluru")
                .price("₹1.65 Cr")
                .type("Apartment")
                .sqft("1760")
                .reraApproved(false)
                .image("/images/p7/property-07-main-01.jpg")
                .mainImages(Arrays.asList(
                        "/images/p7/property-07-main-01.jpg",
                        "/images/p7/property-07-main-01.jpg"
                ))
                .images(Arrays.asList(
                        "/images/p7/property-07-gallery-01.jpg", "/images/p7/property-07-gallery-01.jpg", "/images/p7/property-07-gallery-01.jpg", "/images/p7/property-07-gallery-01.jpg",
                        "/images/p7/property-07-gallery-01.jpg", "/images/p7/property-07-gallery-01.jpg", "/images/p7/property-07-gallery-01.jpg", "/images/p7/property-07-gallery-01.jpg"
                ))
                .bedrooms(3)
                .bathrooms(3)
                .carpetArea("1280 sq.ft")
                .builtupArea("1760 sq.ft")
                .parking("2 Cars")
                .maintenance("₹4,000")
                .furnishing("Unfurnished")
                .facing("West")
                .description("Strategically located 3BHK apartment with clubhouse, swimming pool, kids play area, and 24/7 security.")
                .videoUrl("/videos/apartment_tour.mp4")
                .amenities(Arrays.asList(
                        "3-Phase Power Backup", "24x7 Water Supply", "Gated Community Security",
                        "Covered Car Parking", "Clubhouse & Gym", "Swimming Pool",
                        "Landscaped Garden", "Children Play Area", "High-Speed Internet Ready",
                        "Solar Water Heater", "Modular Kitchen", "Vitrified Tile Flooring"
                ))
                .build();

        // ------------------------- PROPERTY 8 -------------------------

        Property p8 = Property.builder()
                .title("Premium Gated Villa Plot – Devanahalli")
                .location("Brigade Orchards, Devanahalli, Bengaluru")
                .price("₹95 Lakhs")
                .type("Plot")
                .sqft("2400")
                .reraApproved(true)
                .image("/images/p8/property-08-main-01.jpg")
                .mainImages(Arrays.asList(
                        "/images/p8/property-08-main-01.jpg",
                        "/images/p8/property-08-main-01.jpg"
                ))
                .images(Arrays.asList(
                        "/images/p8/property-08-gallery-01.jpg", "/images/p8/property-08-gallery-01.jpg", "/images/p8/property-08-gallery-01.jpg", "/images/p8/property-08-gallery-01.jpg",
                        "/images/p8/property-08-gallery-01.jpg", "/images/p8/property-08-gallery-01.jpg", "/images/p8/property-08-gallery-01.jpg", "/images/p8/property-08-gallery-01.jpg"
                ))
                .bedrooms(0)
                .bathrooms(0)
                .carpetArea("N/A")
                .builtupArea("N/A")
                .parking("N/A")
                .maintenance("₹1 / Sqft")
                .furnishing("N/A")
                .facing("Any")
                .description("Premium 40x60 villa plot in a RERA-approved integrated township with 100+ amenities.")
                .videoUrl("/videos/plot_tour.mp4")
                .amenities(Arrays.asList(
                        "3-Phase Power Backup", "24x7 Water Supply", "Gated Community Security",
                        "Covered Car Parking", "Clubhouse & Gym", "Swimming Pool",
                        "Landscaped Garden", "Children Play Area", "High-Speed Internet Ready",
                        "Solar Water Heater", "Modular Kitchen", "Vitrified Tile Flooring"
                ))
                .build();

        // ------------------------- PROPERTY 9 -------------------------

        Property p9 = Property.builder()
                .title("Premium 4BHK Villa in Whitefield")
                .location("Prestige Glenmore Estates, Whitefield, Bengaluru")
                .price("₹3.85 Cr")
                .type("Independent Villa")
                .sqft("4500")
                .reraApproved(true)
                .image("/images/p9/property-09-main-01.jpg")
                .mainImages(Arrays.asList(
                        "/images/p9/property-09-main-01.jpg",
                        "/images/p9/property-09-main-01.jpg"
                ))
                .images(Arrays.asList(
                        "/images/p9/property-09-gallery-01.jpg", "/images/p9/property-09-gallery-01.jpg", "/images/p9/property-09-gallery-01.jpg", "/images/p9/property-09-gallery-01.jpg",
                        "/images/p9/property-09-gallery-01.jpg", "/images/p9/property-09-gallery-01.jpg", "/images/p9/property-09-gallery-01.jpg", "/images/p9/property-09-gallery-01.jpg"
                ))
                .bedrooms(4)
                .bathrooms(5)
                .carpetArea("3200 sq.ft")
                .builtupArea("4500 sq.ft")
                .parking("3 Cars")
                .maintenance("₹8,500")
                .furnishing("Semi-Furnished")
                .facing("East")
                .description("An ultra-premium 4BHK villa with Italian marble flooring, dedicated servant room, full vastu compliance, and a lush private garden.")
                .videoUrl("/videos/villa_tour_1.mp4")
                .amenities(Arrays.asList(
                        "3-Phase Power Backup", "24x7 Water Supply", "Gated Community Security",
                        "Covered Car Parking", "Clubhouse & Gym", "Swimming Pool",
                        "Landscaped Garden", "Children Play Area", "High-Speed Internet Ready",
                        "Solar Water Heater", "Modular Kitchen", "Vitrified Tile Flooring"
                ))
                .build();

        // ------------------------- PROPERTY 10 -------------------------

        Property p10 = Property.builder()
                .title("Fully-Furnished G+3 Premium Home – RR Nagar")
                .location("BHEL Layout Extension, Pattanagere, RR Nagar")
                .price("₹2.6 Cr (Negotiable)")
                .type("Residential Building")
                .sqft("1000")
                .reraApproved(true)
                .image("/images/p10/property-10-main-01.jpg")
                .mainImages(Arrays.asList(
                        "/images/p10/property-10-main-01.jpg",
                        "/images/p10/property-10-main-01.jpg"
                ))
                .images(Arrays.asList(
                        "/images/p10/property-10-gallery-01.jpg", "/images/p10/property-10-gallery-01.jpg", "/images/p10/property-10-gallery-01.jpg", "/images/p10/property-10-gallery-01.jpg",
                        "/images/p10property-10-gallery-01.jpg", "/images/p10/property-10-gallery-01.jpg", "/images/p10/property-10-gallery-01.jpg", "/images/p10/property-10-gallery-01.jpg"
                ))
                .bedrooms(5)
                .bathrooms(5)
                .carpetArea("N/A")
                .builtupArea("2400 sq.ft (Approx)")
                .parking("Ground Floor Car Parking")
                .maintenance("N/A")
                .furnishing("Fully Furnished")
                .facing("East")
                .description("A premium 25x40 (1000 sq.ft) East-facing fully-furnished G+3 home with 30 squares construction. Features Italian marble flooring, teak wood interiors, LED-lit TV cabinet, modular kitchen with chimney, fall ceilings, Jaguar fittings, stainless steel & glass staircase railing, balconies, and a 10,000-liter sump with borewell.")
                .videoUrl("/videos/p2_house_tour.mp4")
                .amenities(Arrays.asList(
                        "Italian Marble Flooring", "Teak Wood Construction", "Fully Furnished with Wardrobes",
                        "Modern Modular Kitchen", "Fall Ceilings with LED Lighting", "Jaguar Premium Fittings",
                        "Stainless Steel & Glass Staircase", "10,000 Liters Sump with Borewell",
                        "Car Parking Space", "Geysers Installed", "Kitchen Exhaust Chimney",
                        "TV Cabinet with LED Lights", "Balconies on First & Second Floors"
                ))
                .build();


        repo.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10));

        System.out.println("✔ Sample properties loaded successfully.");
    }
}
