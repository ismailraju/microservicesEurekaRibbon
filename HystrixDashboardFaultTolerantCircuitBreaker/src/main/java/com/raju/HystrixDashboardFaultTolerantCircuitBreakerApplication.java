package com.raju;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@EnableHystrix
@EnableHystrixDashboard
@EnableCircuitBreaker
@EnableTurbine
//@EnableTurbineStream
public class HystrixDashboardFaultTolerantCircuitBreakerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardFaultTolerantCircuitBreakerApplication.class, args);
    }
}
