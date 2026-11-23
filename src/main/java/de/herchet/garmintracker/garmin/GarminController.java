package de.herchet.garmintracker.garmin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GarminController {

    private final GarminClient garminClient;

    public GarminController(GarminClient garminClient) {
        this.garminClient = garminClient;
    }

    @GetMapping("/garmin/token-test")
    public String tokenTest() {
        String token = garminClient.getAccesToken();
        return "Token erhalten, Länge: " + token.length();
    }
}