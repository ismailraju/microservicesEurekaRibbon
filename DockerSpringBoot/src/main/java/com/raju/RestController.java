/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raju;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ismail
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {
    
    @RequestMapping("/hi")
    public String get(){
        
        return "hello";
        
    }
    
}
