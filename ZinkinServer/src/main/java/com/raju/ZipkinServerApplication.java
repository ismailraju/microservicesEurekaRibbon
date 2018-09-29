package com.raju;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
//@EnableEurekaClient
@RestController
public class ZipkinServerApplication {

    @GetMapping("/hi")
    String get() {
        return "hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerApplication.class, args);
    }
}
