package com.student.Registration.service;


import com.student.Registration.model.Student;

//we make our class interface bc it help us to hide the method

public interface StudentService { 
	
	public Iterable <Student> getAllStudent(); // abstract method
	
	public void addStudent(Student student);
	
	public Student getStudentById(long id);
	

}
