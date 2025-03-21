package com.project.Course_Registration.Repository;

import com.project.Course_Registration.Models.Courses;
import org.apache.juli.logging.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Courses,String> {
}
