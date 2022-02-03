package com.student.Registration.service;

import java.util.Optional;

import com.student.Registration.model.Student;

//we make our class interface bc it help us to hide the method

public interface StudentService { 
	
	public Iterable <Student> getAllStudent(); // abstract method
	
	public void addStudent(Student student);
	
	public Optional<Student> getById(long id);
	

}
