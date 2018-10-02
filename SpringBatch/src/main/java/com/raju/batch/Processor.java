/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raju.batch;

import com.raju.model.User;
import java.util.HashMap;
import java.util.Map;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

/**
 *
 * @author ismail
 */
@Component
public class Processor implements ItemProcessor<User, User> {

    private static final Map<String, String> D_NAMES = new HashMap<>();

    public Processor() {
        D_NAMES.put("101", "A");
        D_NAMES.put("102", "B");
        D_NAMES.put("103", "C");

    }

    @Override
    public User process(User user) throws Exception {

        String UniqeId = user.getSchoolId() + user.getStudentId();

        user.setId(Long.parseLong(UniqeId));

        System.out.println("Converted id" + UniqeId);

        return user;
    }

}
