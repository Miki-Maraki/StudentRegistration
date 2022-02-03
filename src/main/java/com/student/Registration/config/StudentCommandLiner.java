package com.student.Registration.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.student.Registration.model.Student;
import com.student.Registration.service.StudentService;

@Component
public class StudentCommandLiner implements CommandLineRunner{
	
	@Autowired
	StudentService studentService;
	
	@Override // bc we get the below method from CommandLineRunner Interface
	public void run(String... args) throws Exception{ // used to add data
		
		studentService.addStudent(new Student(100, "George", 34));
		studentService.addStudent(new Student(101, "Bob", 29));
		studentService.addStudent(new Student(102, "Meke", 37));
		studentService.addStudent(new Student(103, "Dani", 24));
		studentService.addStudent(new Student(104, "Hani", 30));
	}

}

