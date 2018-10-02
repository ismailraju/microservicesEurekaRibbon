/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raju.repository;

import com.raju.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ismail
 */
public interface UserRepository extends JpaRepository<User, Integer>{
    
    
    
    
}
