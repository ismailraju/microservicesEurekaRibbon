/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raju.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author ismail
 */
@Entity
public class User {

    @Id
    Long id;
    String schoolId;
    String studentId;
    String account;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

  
    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", schoolId=" + schoolId + ", studentId=" + studentId + ", account=" + account + '}';
    }

}