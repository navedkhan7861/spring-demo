package com.springrest.sprpingrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.sprpingrest.entities.Courses;
import com.springrest.sprpingrest.service.CourseService;

@RestController
public class MyController {
	
	@Autowired
	CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		return "this is home";
	}
	@GetMapping("/courses")
	public List<Courses> getCources(){
		return courseService.getCourses();
	}
	
	@PostMapping("/courses")
	public Courses addCourses(@RequestBody Courses c) {
		return courseService.addCourses(c);
	}
	
	@GetMapping("/courses/{id}")
	public Courses getCoursesById(@PathVariable long id){
		return courseService.getCoursesById(id);
	}
	
	
}
