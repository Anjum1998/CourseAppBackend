package com.example.CourseApp_Backend.controller;

import com.example.CourseApp_Backend.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @GetMapping("/")
    public String Home()
    {
        return "Welcome";
    }
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String AddCourse(@RequestBody Course c)
    {
        System.out.println(c.getCourseTitle().toString());
        System.out.println(c.getCourseDescription().toString());
        System.out.println(c.getCourseVenue().toString());
        System.out.println(c.getCourseDuration().toString());
        System.out.println(c.getCourseDate().toString());
        return "Course Added Successfully";
    }
}
