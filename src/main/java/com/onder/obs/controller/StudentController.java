package com.onder.obs.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.onder.obs.entity.Student;
import com.onder.obs.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("api/1.0/students")
	public void createStudent(@RequestBody Student student) {
		studentService.createStudent(student);
	}
	
}
