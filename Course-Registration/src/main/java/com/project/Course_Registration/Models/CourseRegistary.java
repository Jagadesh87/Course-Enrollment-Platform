package com.project.Course_Registration.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CourseRegistary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto increment id;
    private int id;


    private String username;
    private String Emailid;
    private String coursename;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailid() {
        return Emailid;
    }

    public void setEmailid(String emailid) {
        Emailid = emailid;
    }

    public String getCoursename() {
        return coursename;
    }

    public CourseRegistary(String username, String emailid, String coursename) {
        this.username = username;
        Emailid = emailid;
        this.coursename = coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public CourseRegistary(){

    }
}
