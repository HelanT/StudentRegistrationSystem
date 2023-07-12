package com.takeo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="STUDENT")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name ="ID")
	private int id;
	@Column(name ="FIRST_NAME")
	private String firstName;
	@Column(name ="LAST_NAME")
	private String lastName;
	@Column(name ="GENDER")
	private String gender;
	@Column(name ="COURSES")
	private String courses;
	@Column(name ="EMAIL")
	private String email;
	@Column(name ="PASSWORD")
	private String password;
	@Column(name ="MOBILE_NUMBER")
	private long mobileNumber;
	@Column(name ="DOB")
	private String dob;
	
	
	

}
