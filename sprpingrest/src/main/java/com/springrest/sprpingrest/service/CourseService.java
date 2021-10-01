package com.springrest.sprpingrest.service;

import java.util.List;

import com.springrest.sprpingrest.entities.Courses;

public interface CourseService {

	public List<Courses> getCourses();
	
	public Courses addCourses(Courses c);
	
	public Courses getCoursesById(long id);
}
