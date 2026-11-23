package de.herchet.garmintracker.garmin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class GarminClient {

    // 1. :  Felder welche sich Klasse merken soll
    private final RestClient restClient;
    private final String apiKey;

    // 2. :  Konstruktor
    public GarminClient(@Value("${garmin.api.key}") String apiKey) {
        this.apiKey = apiKey;
        this.restClient = RestClient.create("https://personal.connectapi.garmin.com");
    }

    // 3. : Methoden
    public String getAccesToken(){
        String token = restClient.post()
                .uri("/personalapitoken-service/personal-api/personal-api-key/token")
                .header("Authorization", "ApiKey " + apiKey)
                .retrieve()
                .body(String.class);
        return token.trim();
    }

}
