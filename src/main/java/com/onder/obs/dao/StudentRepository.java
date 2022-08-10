package com.onder.obs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onder.obs.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
