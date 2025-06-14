package com.udacity.vehicles.client.prices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Client to fetch price from the pricing service.
 */
@Component
public class PriceClient {

    private static final Logger log = LoggerFactory.getLogger(PriceClient.class);

    private final WebClient pricingWebClient;

    public PriceClient(@Qualifier("pricing") WebClient pricingWebClient) {
        this.pricingWebClient = pricingWebClient;
    }

    public String getPrice(Long vehicleId) {
        try {
            Price price = pricingWebClient
                    .get()
                    .uri("/prices/{id}", vehicleId)
                    .retrieve()
                    .bodyToMono(Price.class)
                    .block();

            return String.format("%s %s", price.getCurrency(), price.getPrice());
        } catch (Exception e) {
            log.error("Unexpected error retrieving price for vehicle {}", vehicleId, e);
            return "(consult price)";
        }
    }
}
