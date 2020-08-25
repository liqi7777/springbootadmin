package com.liqi.springbootadmineureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringbootadminEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootadminEurekaApplication.class, args);
    }

}
