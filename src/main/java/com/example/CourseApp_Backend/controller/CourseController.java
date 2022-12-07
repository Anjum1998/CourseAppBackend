package com.example.CourseApp_Backend.controller;

import com.example.CourseApp_Backend.dao.CourseDao;
import com.example.CourseApp_Backend.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CourseController {
    @Autowired
    private CourseDao dao;
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Course> ViewCourse()
    {
        return (List<Course>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public Map<String,String> AddCourse(@RequestBody Course c)
    {
        System.out.println(c.getCourseTitle().toString());
        System.out.println(c.getCourseDescription().toString());
        System.out.println(c.getCourseVenue().toString());
        System.out.println(c.getCourseDuration().toString());
        System.out.println(c.getCourseDate().toString());
        dao.save(c);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }
}
