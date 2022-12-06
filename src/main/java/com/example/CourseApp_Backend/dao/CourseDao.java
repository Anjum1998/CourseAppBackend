package com.example.CourseApp_Backend.dao;

import com.example.CourseApp_Backend.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<Course,Integer> {
}
