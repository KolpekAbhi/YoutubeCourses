package com.SpringDemoProject.courseservice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.SpringDemoProject.courseentity.CourseList;
import com.SpringDemoProject.courserepository.CourseRepository;

@Service
public class CourseServiceimp implements CourseService{

    
	@Autowired
	CourseRepository cr;
	
	@Override
	public CourseList insertdata(CourseList course) {

		return cr.save(course);
	}
	
	@Override
	public List<CourseList> getdata() {

		return cr.findAll();
	}

	@Override
	public CourseList updatedata(int id, CourseList course) {

		CourseList courselist = cr.findById(id).get();
		if(courselist != null)
		{
			courselist.setId(id);
			return cr.save(course);
			
		}
		return null;
	}

	@Override
	public String deletedata(int id) {


		CourseList courselist = cr.findById(id).get();
		
		if(courselist != null)
		{
		    cr.delete(courselist);
		}
		return "data Delete Successfully..!!";
	}

	
}
