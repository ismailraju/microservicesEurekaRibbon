package com.raju;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootMicroserviceForexService2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMicroserviceForexService2Application.class, args);
    }
}
