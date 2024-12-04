package com.example.usp;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/course")
	public List<Course> retrieveAllCourse(){
		return Arrays.asList(
				new Course(1, "AWS", "ups"),
				new Course(2, "AWS", "ups"),
				new Course(3, "AWS", "ups")
				);
	}

}
