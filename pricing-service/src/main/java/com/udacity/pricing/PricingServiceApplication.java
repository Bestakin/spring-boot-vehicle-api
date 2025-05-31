package com.udacity.pricing;

import com.udacity.pricing.domain.Price;
import com.udacity.pricing.domain.PriceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class PricingServiceApplication {
    public static void main(String[] args){
        SpringApplication.run(PricingServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadTestData(PriceRepository repository){
        return args -> {
            repository.save(new Price(1L, "USD", 1000.00));
            repository.save(new Price(2L, "USD", 12345.67));
            repository.save(new Price(3L, "USD", 8900.50));
        };
    }


}
