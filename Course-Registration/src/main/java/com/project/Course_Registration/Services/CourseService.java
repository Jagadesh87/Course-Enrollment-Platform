package com.project.Course_Registration.Services;

import com.project.Course_Registration.Models.CourseRegistary;
import com.project.Course_Registration.Models.Courses;
import com.project.Course_Registration.Repository.CourseRegisRepository;
import com.project.Course_Registration.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CourseRegisRepository courseRegisRepository;


    public List<Courses> availablecourses(){

        return courseRepository.findAll();
    }

    public List<CourseRegistary> Enrolledstudents(){
        return courseRegisRepository.findAll();
    }

    public void enrollCourse(String username,String Emailid,String coursename) {
        CourseRegistary courseRegistary = new CourseRegistary(username,Emailid,coursename);
        courseRegisRepository.save(courseRegistary);
    }
}
