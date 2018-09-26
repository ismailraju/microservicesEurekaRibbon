/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raju.repository;

import com.raju.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author ismail
 */
public interface UserRepository extends MongoRepository<Users, Integer> {

}
