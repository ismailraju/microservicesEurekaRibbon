package com.raju;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ZipkinClientApplication {

    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @RequestMapping("/hi")
    String get() {

        return getRestTemplate().getForEntity("http://localhost:8081/hi", String.class).getBody();
    }

    public static void main(String[] args) {
        SpringApplication.run(ZipkinClientApplication.class, args);
    }
}
