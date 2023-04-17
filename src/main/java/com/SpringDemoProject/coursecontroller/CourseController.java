package com.SpringDemoProject.coursecontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.SpringDemoProject.courseentity.CourseList;
import com.SpringDemoProject.courseservice.CourseService;

@CrossOrigin (origins = "http://localhost:3000")
@RestController
public class CourseController {

	
	@Autowired
	CourseService cs;
	
	@PostMapping("/insert")
	public CourseList insertdata(@RequestBody CourseList course )
	{
		return cs.insertdata(course);
	}
	
	@GetMapping("/get")
	public List<CourseList> getdata()
	{
		return cs.getdata();
	}
	
	@PutMapping("/update/{id}")
	public CourseList updatedata(@PathVariable int id ,@RequestBody CourseList course)
	{
		return cs.updatedata(id , course);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletedata(@PathVariable int id)
	{
		return cs.deletedata(id);
		
	}
	
}
