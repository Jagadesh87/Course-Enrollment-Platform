package com.project.Course_Registration.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Courses {
    @Id
    private String Courseid;
    private String CourseName;
    private String Trainer;
    private int durationInweeks;

    public String getCourseid() {
        return Courseid;
    }

    public void setCourseid(String courseid) {
        Courseid = courseid;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getTrainer() {
        return Trainer;
    }

    public void setTrainer(String trainer) {
        Trainer = trainer;
    }

    public int getDurationInweeks() {
        return durationInweeks;
    }

    public void setDurationInweeks(int durationInweeks) {
        this.durationInweeks = durationInweeks;
    }
}
