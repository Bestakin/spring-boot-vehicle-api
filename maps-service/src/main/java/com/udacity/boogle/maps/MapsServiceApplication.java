package com.udacity.boogle.maps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.udacity.boogle.maps")
@EnableEurekaClient
public class MapsServiceApplication {
    public static void main (String[] args){
        SpringApplication.run(MapsServiceApplication.class, args);
    }
}
