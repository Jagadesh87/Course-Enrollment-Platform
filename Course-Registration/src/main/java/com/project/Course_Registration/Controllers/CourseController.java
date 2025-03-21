package com.project.Course_Registration.Controllers;

import com.project.Course_Registration.Models.CourseRegistary;
import com.project.Course_Registration.Models.Courses;
import com.project.Course_Registration.Repository.CourseRegisRepository;
import com.project.Course_Registration.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5500")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("Courses")
    public List<Courses> availablecourses(){
        return courseService.availablecourses();
    }

    @GetMapping("Courses/enrolled")
    public List<CourseRegistary> Enrolledstudents(){
        return courseService.Enrolledstudents();
    }

    @PostMapping("Courses/register")
    public String enrollCourse(@RequestParam("username") String username,
                               @RequestParam("Emailid") String Emailid,
                               @RequestParam("coursename") String coursename) {
        courseService.enrollCourse(username,Emailid,coursename);
        return "Congratulations "+username+" You successfully Registered "+coursename;
    }
}
