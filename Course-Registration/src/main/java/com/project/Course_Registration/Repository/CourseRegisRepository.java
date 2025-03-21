package com.project.Course_Registration.Repository;

import com.project.Course_Registration.Models.CourseRegistary;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;

@Registered
public interface CourseRegisRepository extends JpaRepository<CourseRegistary,Integer> {
}
