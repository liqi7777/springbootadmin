package com.liqi.springboodadminclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringboodadminProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringboodadminProducerApplication.class, args);
    }

}
