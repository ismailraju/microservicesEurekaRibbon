/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raju;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ismailu
 */
@RefreshScope
@RequestMapping("/rest")
@RestController
public class MessageResource {

    @Value("${message: default Hello}")
    private String message;

    @GetMapping("message")
    public String message() {

        return message;
    }

}
