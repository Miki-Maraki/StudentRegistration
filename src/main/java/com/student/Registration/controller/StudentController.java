package com.student.Registration.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.Registration.model.Student;
import com.student.Registration.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController { // web layer class
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/studentList")               // option 1
	public Iterable<Student> getAllStudent(){
		Iterable<Student> is = studentService.getAllStudent();
		List<Student> stlt = new ArrayList<>();
		
		for(Student stud : is) {
			stlt.add(stud);
		}
		return stlt;
	}
	
/*	@GetMapping("/students")                   // option 2
	public Iterable<Student> getAllStudent(){
		return studentService.getAllStudent();
	}
*/	
	@PostMapping("/add/{student}")
	public List<Student> addStudent(@RequestBody Student student){
		studentService.addStudent(student);
		Iterable<Student> st = getAllStudent();
		List<Student> stList = new ArrayList<>();
		for (Student stud: st) {
			stList.add(stud);
		}
		return stList;
	}
	//public Student addStudent(Student student) {
		//return studentService.addStudent(student)
		
		
	

}
