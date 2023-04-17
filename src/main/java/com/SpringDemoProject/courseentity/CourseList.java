package com.SpringDemoProject.courseentity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CourseList {
	
	private int id ;
	private String title;
	private String decs;
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDecs() {
		return decs;
	}
	public void setDecs(String decs) {
		this.decs = decs;
	}
	
	@Override
	public String toString() {
		return "CourseList [id=" + id + ", title=" + title + ", decs=" + decs + "]";
	}
	
	
	

}
