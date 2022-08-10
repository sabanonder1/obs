package com.onder.obs.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="student")
@Data
public class Student {
	
	@Id	
	private Long studentID;
	
	private String studentName;

}
