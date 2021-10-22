package com.offside.offside.module;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SearchAPI {
    private String header = "";

    public static void getPlayer(String name){
        // unirest...
        HttpResponse<String> response = Unirest.get("https://api-football-v1.p.rapidapi.com/v3/players")
                .header("x-rapidapi-host", "api-football-v1.p.rapidapi.com")
                .header("x-rapidapi-key", "d8421f0fb0mshc7b48947aee0a7bp144348jsnc6ea48e0bf82")
                .queryString("league", 39)
                .queryString("search", name)
                .asString();

        log.info("response = {}", response.getBody());

    }
}
