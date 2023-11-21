package com.example.springboot.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAll(){
		return Arrays.asList(
				new Course((long) 1,"Java","Udemy"),
				new Course((long) 2,"Python","Udemy")
				);
	}

}
