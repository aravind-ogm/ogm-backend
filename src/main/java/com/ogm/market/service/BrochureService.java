package com.ogm.market.service;

import com.ogm.market.dto.BrochureRequest;
import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class BrochureService {

    // Path where the generated brochure lives (adjust if you move it)
    private final Path brochurePath = Paths.get("src/main/resources/static/brochures/ogm-brochure.pdf");


    /**
     * For demo we return the file path. In production, you should return a public HTTPS URL
     * to the brochure (S3 or static hosting), or stream the file via a download endpoint.
     */
    public String getBrochureFilePath() {
        return brochurePath.toString();
    }

    public boolean brochureExists() {
        return Files.exists(brochurePath);
    }

    public Path getBrochurePath() {
        return brochurePath;
    }

    // you can add logging/storage of the BrochureRequest (save to DB) here
    public void recordRequest(BrochureRequest req) {
        // TODO: persist to database or analytics
    }
}
