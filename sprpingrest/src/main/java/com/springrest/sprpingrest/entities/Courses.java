package com.springrest.sprpingrest.entities;

import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class Courses {
	@Id
	private long id;
	private String title;
	private String description;
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Courses(long id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	public long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", title=" + title + ", description=" + description + "]";
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
