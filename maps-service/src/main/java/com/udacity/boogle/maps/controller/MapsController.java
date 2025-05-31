package com.udacity.boogle.maps.controller;

import com.udacity.boogle.maps.model.Address;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/maps")
public class MapsController {
    private final com.udacity.boogle.maps.repository.MockAddressRepository repository;

    public MapsController(com.udacity.boogle.maps.repository.MockAddressRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Address getAddress(@RequestParam("lat") double lat, @RequestParam("lon") double lon) {
        return repository.getRandomAddress();
    }

}
