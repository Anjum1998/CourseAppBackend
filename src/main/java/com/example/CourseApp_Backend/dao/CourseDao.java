package com.example.CourseApp_Backend.dao;

import com.example.CourseApp_Backend.model.Course;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseDao extends CrudRepository<Course,Integer> {
    @Query(value = "SELECT `id`, `course_date`, `course_description`, `course_duration`, `course_title`, `course_venue` FROM `courses` WHERE `course_title` LIKE  %:courseTitle%",nativeQuery = true)

    List<Course> SearchCourse(@Param("courseTitle") String courseTitle);
}
