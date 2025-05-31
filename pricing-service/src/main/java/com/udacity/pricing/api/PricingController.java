package com.udacity.pricing.api;

import com.udacity.pricing.domain.Price;
import com.udacity.pricing.domain.PriceRepository;
import com.udacity.pricing.service.PriceException;
import com.udacity.pricing.service.PricingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/prices")
public class PricingController {

    private final PricingService pricingService;

    @Autowired
    public PricingController(PricingService pricingService){
        this.pricingService = pricingService;
    }

    @GetMapping("/{vehicleId}")
    public Price getPrice(@PathVariable Long vehicleId){
        try{
            return pricingService.getPrice(vehicleId);
        } catch (PriceException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Price not found for vehicle " + vehicleId, e);
        }

    }
}
