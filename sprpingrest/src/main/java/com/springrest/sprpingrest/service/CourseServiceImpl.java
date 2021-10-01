package com.springrest.sprpingrest.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Service;

import com.springrest.sprpingrest.entities.Courses;

@Service
public class CourseServiceImpl implements CourseService {
	
	List<Courses> list;
	
	public CourseServiceImpl() {
		
		// TODO Auto-generated constructor stub
		 list= new ArrayList<Courses>();
			list.add( new Courses(1,"1.book","1.bookDesc") );
			list.add( new Courses(2,"2.book","1.bookDesc") );
			list.add( new Courses(3,"3.book","1.bookDesc") );
			list.add( new Courses(4,"4.book","1.bookDesc") );
			list.add( new Courses(5,"5.book","1.bookDesc") );
			list.add( new Courses(6,"6.book","1.bookDesc") );
	}

	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Courses addCourses(Courses c) {
		list.add(c);
		return c;
	}
	@Override
	public Courses getCoursesById(long id) {
		Courses c=null;
		for( Courses i:list) {
			if (i.getId()==id) {
				c=i;
				break;
			}
		}
		return c;
	}
}
