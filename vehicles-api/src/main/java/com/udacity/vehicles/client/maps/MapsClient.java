package com.udacity.vehicles.client.maps;

import com.udacity.vehicles.domain.Location;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class MapsClient {

    private final WebClient mapsWebClient;

    public MapsClient(@Qualifier("maps") WebClient mapsWebClient) {
        this.mapsWebClient = mapsWebClient;
    }

    public Location getAddress(Location location) {
        try {
            Address address = mapsWebClient.get()
                    .uri(uriBuilder -> uriBuilder
                            .path("/maps")
                            .queryParam("lat", location.getLat())
                            .queryParam("lon", location.getLon())
                            .build())
                    .retrieve()
                    .bodyToMono(Address.class)
                    .block();

            location.setAddress(address.getAddress());
            location.setCity(address.getCity());
            location.setState(address.getState());
            location.setZip(address.getZip());

            return location;

        } catch (Exception e) {
            System.err.println("Maps service unavailable: " + e.getMessage());
            return location;
        }
    }
}
