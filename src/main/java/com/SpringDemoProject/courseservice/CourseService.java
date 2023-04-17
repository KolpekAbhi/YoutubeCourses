package com.SpringDemoProject.courseservice;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.SpringDemoProject.courseentity.CourseList;


public interface CourseService {

	public List<CourseList> getdata();
	
	public CourseList insertdata(@RequestBody CourseList course );
	
	public CourseList updatedata(@PathVariable int id ,@RequestBody CourseList course);
	
	public String deletedata(@PathVariable int id);
}
