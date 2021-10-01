package com.springrest.sprpingrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.sprpingrest.entities.Courses;

public interface CourseDao extends JpaRepository<Courses,Long> {
}
