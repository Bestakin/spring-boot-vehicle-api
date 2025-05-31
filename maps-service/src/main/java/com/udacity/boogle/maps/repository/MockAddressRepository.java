package com.udacity.boogle.maps.repository;

import com.udacity.boogle.maps.model.Address;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class MockAddressRepository {
    private static final List<Address> ADDRESSES = Arrays.asList(
            new Address("123 Main Street", "New York", "NY", "10001"),
            new Address("456 Elm Street", "Los Angeles", "CA", "90001"),
            new Address("789 Oak Avenue", "Chicago", "IL", "60007"),
            new Address("321 Maple Drive", "Houston", "TX", "77001"),
            new Address("654 Pine Lane", "Phoenix", "AZ", "85001")
    );

    public Address getRandomAddress() {
        int index = new Random().nextInt(ADDRESSES.size());
        return ADDRESSES.get(index);
    }
}
