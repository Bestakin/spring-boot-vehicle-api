package com.udacity.pricing.service;

import com.udacity.pricing.domain.Price;
import com.udacity.pricing.domain.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PricingService {
    private final PriceRepository priceRepository;

    @Autowired
    public PricingService(PriceRepository priceRepository){
        this.priceRepository = priceRepository;
    }

    public Price getPrice(Long vehicleId) throws PriceException{
        return priceRepository.findByVehicleId(vehicleId)
                .orElseThrow(() -> new PriceException("Price not found for vehicleId: " + vehicleId));
    }
}
