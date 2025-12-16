package com.ogm.market.util;

import com.ogm.market.model.NearbyLocation;
import com.ogm.market.model.Property;
import com.ogm.market.repository.PropertyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataInitializer implements CommandLineRunner {

    private final PropertyRepository repo;

    // 🔴 UPDATE THIS WITH YOUR RENDER BACKEND URL
    private static final String BASE_URL = "https://ogm-backend.onrender.com";

    public DataInitializer(PropertyRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) {

        if (repo.count() > 0) return;

        Property p1 = Property.builder()
                .title("Singapore Style 4 BHK Villa in Gattahalli")
                .location("Astro Green Cascade, Gattahalli, Bengaluru")
                .price("₹7 Cr")
                .type("Residential Building")
                .sqft("4300")
                .reraApproved(true)
                .image(BASE_URL + "/images/p1/property-01-main-01.jpg")
                .mainImages(Arrays.asList(
                        BASE_URL + "/images/p1/property-01-main-01.jpg",
                        BASE_URL + "/images/p1/property-01-main-01.jpg"
                ))
                .images(Arrays.asList(
                        BASE_URL + "/images/p1/property-01-gallery-01.jpg",
                        BASE_URL + "/images/p1/property-01-gallery-02.jpg",
                        BASE_URL + "/images/p1/property-01-gallery-03.jpg"
                ))
                .videoUrl(BASE_URL + "/videos/p1/property-01-video-01.mp4")
                .build();

        Property p2 = Property.builder()
                .title("2 & 3 BHK Flats in Kasavanahalli")
                .location("Kasavanahalli, Bengaluru")
                .price("₹1.25 Cr")
                .type("Residential Building")
                .sqft("1569")
                .reraApproved(true)
                .image(BASE_URL + "/images/p2/property-02-main-01.jpeg")
                .mainImages(Arrays.asList(
                        BASE_URL + "/images/p2/property-02-main-01.jpeg"
                ))
                .images(Arrays.asList(
                        BASE_URL + "/images/p2/property-02-gallery-01.jpeg",
                        BASE_URL + "/images/p2/property-02-gallery-02.jpeg"
                ))
                .videoUrl(BASE_URL + "/videos/p2_house_tour.mp4")
                .build();

        Property p3 = Property.builder()
                .title("2 BHK Flats in Junnasandra")
                .location("Junnasandra, Bengaluru")
                .price("₹40 Lakhs")
                .type("Residential Building")
                .sqft("1100")
                .soldOut(true)
                .reraApproved(true)
                .image(BASE_URL + "/images/p3/property-03-main-01.jpg")
                .mainImages(Arrays.asList(BASE_URL + "/images/p3/property-03-main-01.jpg"))
                .images(Arrays.asList(
                        BASE_URL + "/images/p3/property-03-gallery-01.jpg",
                        BASE_URL + "/images/p3/property-03-gallery-02.jpg"
                ))
                .videoUrl(BASE_URL + "/videos/apartment_tour.mp4")
                .build();

        Property p4 = Property.builder()
                .title("2 BHK in Sobha Dream Acres")
                .location("Sobha Dream Acres, Varthur, Bengaluru")
                .price("₹75.5 Lakhs")
                .type("Large Community Building")
                .sqft("1012")
                .soldOut(true)
                .reraApproved(true)
                .image(BASE_URL + "/images/p4/property-04-main-01.jpg")
                .mainImages(Arrays.asList(BASE_URL + "/images/p4/property-04-main-01.jpg"))
                .images(Arrays.asList(
                        BASE_URL + "/images/p4/property-04-gallery-01.jpg",
                        BASE_URL + "/images/p4/property-04-gallery-02.jpg"
                ))
                .videoUrl(BASE_URL + "/videos/plot_tour.mp4")
                .build();

        Property p5 = Property.builder()
                .title("Dummy2 – Electronic City")
                .location("Ajmera Silicon Valley, Electronic City Phase 1")
                .price("₹42 Lakhs")
                .type("Studio")
                .sqft("620")
                .image(BASE_URL + "/images/p5/property-05-main-01.jpg")
                .mainImages(Arrays.asList(BASE_URL + "/images/p5/property-05-main-01.jpg"))
                .images(Arrays.asList(BASE_URL + "/images/p5/property-05-gallery-01.jpg"))
                .videoUrl(BASE_URL + "/videos/studio_tour.mp4")
                .build();

        Property p6 = Property.builder()
                .title("Skyline 5BHK Penthouse – Indiranagar")
                .location("Indiranagar, Bengaluru")
                .price("₹5.6 Cr")
                .type("Penthouse")
                .sqft("5200")
                .image(BASE_URL + "/images/p6/property-06-main-01.jpg")
                .mainImages(Arrays.asList(BASE_URL + "/images/p6/property-06-main-01.jpg"))
                .images(Arrays.asList(BASE_URL + "/images/p6/property-06-gallery-01.jpg"))
                .videoUrl(BASE_URL + "/videos/penthouse_tour.mp4")
                .build();

        Property p7 = Property.builder()
                .title("Premium 3BHK Apartment – Sarjapur Road")
                .location("Sarjapur Road, Bengaluru")
                .price("₹1.65 Cr")
                .type("Apartment")
                .sqft("1760")
                .image(BASE_URL + "/images/p7/property-07-main-01.jpg")
                .mainImages(Arrays.asList(BASE_URL + "/images/p7/property-07-main-01.jpg"))
                .images(Arrays.asList(BASE_URL + "/images/p7/property-07-gallery-01.jpg"))
                .videoUrl(BASE_URL + "/videos/apartment_tour.mp4")
                .build();

        Property p8 = Property.builder()
                .title("Premium Gated Villa Plot – Devanahalli")
                .location("Devanahalli, Bengaluru")
                .price("₹95 Lakhs")
                .type("Plot")
                .sqft("2400")
                .image(BASE_URL + "/images/p8/property-08-main-01.jpg")
                .mainImages(Arrays.asList(BASE_URL + "/images/p8/property-08-main-01.jpg"))
                .images(Arrays.asList(BASE_URL + "/images/p8/property-08-gallery-01.jpg"))
                .videoUrl(BASE_URL + "/videos/plot_tour.mp4")
                .build();

        Property p9 = Property.builder()
                .title("Premium 4BHK Villa in Whitefield")
                .location("Whitefield, Bengaluru")
                .price("₹3.85 Cr")
                .type("Independent Villa")
                .sqft("4500")
                .image(BASE_URL + "/images/p9/property-09-main-01.jpg")
                .mainImages(Arrays.asList(BASE_URL + "/images/p9/property-09-main-01.jpg"))
                .images(Arrays.asList(BASE_URL + "/images/p9/property-09-gallery-01.jpg"))
                .videoUrl(BASE_URL + "/videos/villa_tour_1.mp4")
                .build();

        Property p10 = Property.builder()
                .title("Fully-Furnished G+3 Premium Home – RR Nagar")
                .location("RR Nagar, Bengaluru")
                .price("₹2.6 Cr")
                .type("Residential Building")
                .sqft("1000")
                .image(BASE_URL + "/images/p10/property-10-main-01.jpg")
                .mainImages(Arrays.asList(BASE_URL + "/images/p10/property-10-main-01.jpg"))
                .images(Arrays.asList(BASE_URL + "/images/p10/property-10-gallery-01.jpg"))
                .videoUrl(BASE_URL + "/videos/p2_house_tour.mp4")
                .build();

        Property p11 = Property.builder()
                .title("3 BHK Lake View Apartment – Hebbal")
                .location("Hebbal, Bengaluru")
                .price("₹1.45 Cr")
                .type("Apartment")
                .sqft("1680")
                .image(BASE_URL + "/images/p11/property-11-main-01.png")
                .mainImages(Arrays.asList(BASE_URL + "/images/p11/property-11-main-01.png"))
                .images(Arrays.asList(BASE_URL + "/images/p11/property-11-gallery-01.png"))
                .videoUrl(BASE_URL + "/videos/p11_tour.mp4")
                .build();

        Property p12 = Property.builder()
                .title("Modern Studio Apartment – Electronic City")
                .location("Electronic City")
                .price("₹32 Lakhs")
                .type("Studio")
                .sqft("450")
                .image(BASE_URL + "/images/p12/property-12-main-01.png")
                .mainImages(Arrays.asList(BASE_URL + "/images/p12/property-12-main-01.png"))
                .images(Arrays.asList(BASE_URL + "/images/p12/property-12-gallery-01.png"))
                .videoUrl(BASE_URL + "/videos/p12_tour.mp4")
                .build();

        Property p13 = Property.builder()
                .title("Luxury 4 BHK Penthouse – Koramangala")
                .location("Koramangala, Bengaluru")
                .price("₹4.8 Cr")
                .type("Penthouse")
                .sqft("3600")
                .image(BASE_URL + "/images/p13/property-13-main-01.png")
                .mainImages(Arrays.asList(BASE_URL + "/images/p13/property-13-main-01.png"))
                .images(Arrays.asList(BASE_URL + "/images/p13/property-13-gallery-01.png"))
                .videoUrl(BASE_URL + "/videos/p13_tour.mp4")
                .build();

        Property p14 = Property.builder()
                .title("Premium Villa Plot – Sarjapur Road")
                .location("Sarjapur Road, Bengaluru")
                .price("₹82 Lakhs")
                .type("Plot")
                .sqft("2400")
                .image(BASE_URL + "/images/p14/property-14-main-01.png")
                .mainImages(Arrays.asList(BASE_URL + "/images/p14/property-14-main-01.png"))
                .images(Arrays.asList(BASE_URL + "/images/p14/property-14-gallery-01.png"))
                .videoUrl(BASE_URL + "/videos/p14_tour.mp4")
                .build();

        Property p15 = Property.builder()
                .title("2 BHK Affordable Apartment – Whitefield")
                .location("Whitefield, Bengaluru")
                .price("₹56 Lakhs")
                .type("Apartment")
                .sqft("980")
                .image(BASE_URL + "/images/p15/property-15-main-01.png")
                .mainImages(Arrays.asList(BASE_URL + "/images/p15/property-15-main-01.png"))
                .images(Arrays.asList(BASE_URL + "/images/p15/property-15-gallery-01.png"))
                .videoUrl(BASE_URL + "/videos/p15_tour.mp4")
                .build();

        Property p16 = Property.builder()
                .title("5 BHK Ultra Luxury Villa – Yelahanka")
                .location("Yelahanka, Bengaluru")
                .price("₹6.2 Cr")
                .type("Villa")
                .sqft("5200")
                .image(BASE_URL + "/images/p16/property-16-main-01.jpg")
                .mainImages(Arrays.asList(BASE_URL + "/images/p16/property-16-main-01.jpg"))
                .images(Arrays.asList(BASE_URL + "/images/p16/property-16-gallery-01.jpg"))
                .videoUrl(BASE_URL + "/videos/p16_tour.mp4")
                .build();

        Property p17 = Property.builder()
                .title("1 BHK Compact Home – JP Nagar")
                .location("JP Nagar, Bengaluru")
                .price("₹38 Lakhs")
                .type("Apartment")
                .sqft("620")
                .image(BASE_URL + "/images/p17/property-17-main-01.jpg")
                .mainImages(Arrays.asList(BASE_URL + "/images/p17/property-17-main-01.jpg"))
                .images(Arrays.asList(BASE_URL + "/images/p17/property-17-gallery-01.jpg"))
                .videoUrl(BASE_URL + "/videos/p17_tour.mp4")
                .build();

        Property p18 = Property.builder()
                .title("Luxury 3 BHK Row House – Hennur Main Road")
                .location("Hennur, Bengaluru")
                .price("₹2.95 Cr")
                .type("Row House")
                .sqft("2560")
                .image(BASE_URL + "/images/p18/property-18-main-01.jpg")
                .mainImages(Arrays.asList(BASE_URL + "/images/p18/property-18-main-01.jpg"))
                .images(Arrays.asList(BASE_URL + "/images/p18/property-18-gallery-01.jpg"))
                .videoUrl(BASE_URL + "/videos/p18_tour.mp4")
                .build();

        Property p19 = Property.builder()
                .title("2 BHK Modern Apartment – Bannerghatta Road")
                .location("Bannerghatta Road, Bengaluru")
                .price("₹68 Lakhs")
                .type("Apartment")
                .sqft("1150")
                .image(BASE_URL + "/images/p19/property-19-main-01.jfif")
                .mainImages(Arrays.asList(BASE_URL + "/images/p19/property-19-main-01.jfif"))
                .images(Arrays.asList(BASE_URL + "/images/p19/property-19-gallery-01.jfif"))
                .videoUrl(BASE_URL + "/videos/p19_tour.mp4")
                .build();

        Property p20 = Property.builder()
                .title("Modern 3 BHK Apartment – MG Road")
                .location("MG Road, Bengaluru")
                .price("₹2.3 Cr")
                .type("Apartment")
                .sqft("1850")
                .image(BASE_URL + "/images/p20/property-20-main-01.jfif")
                .mainImages(Arrays.asList(BASE_URL + "/images/p20/property-20-main-01.jfif"))
                .images(Arrays.asList(BASE_URL + "/images/p20/property-20-gallery-01.jfif"))
                .videoUrl(BASE_URL + "/videos/p20_tour.mp4")
                .build();

        repo.saveAll(Arrays.asList(
                p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,
                p11,p12,p13,p14,p15,p16,p17,p18,p19,p20
        ));

        System.out.println("✔ All 20 properties loaded with absolute URLs");
    }
}
