/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raju;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ismailu
 */
@RestController
@RequestMapping("/rest")
public class RestResource {

    @HystrixCommand(fallbackMethod = "fallBackHello", commandKey = "helloC", groupKey = "helloG")
    @GetMapping("/hello")
    String get() {
        //wrong
        if (RandomUtils.nextBoolean()) {
            throw new RuntimeException("Failed!");
        }

        return "hello world!!";
    }

    public String fallBackHello() {

        return "Fall Back Hello Initiated";
    }
}
