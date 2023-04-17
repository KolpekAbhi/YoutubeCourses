package com.SpringDemoProject.courserepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.SpringDemoProject.courseentity.CourseList;

@Repository
public interface CourseRepository extends JpaRepository<CourseList, Integer> {

}
