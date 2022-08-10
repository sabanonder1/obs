package com.onder.obs.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onder.obs.dao.StudentRepository;
import com.onder.obs.entity.Student;

@Service
public class StudentService {
	@Autowired
	private StudentRepository StudentRepository;

	public Student createStudent(Student Student) {
		return StudentRepository.save(Student);
	}


}
