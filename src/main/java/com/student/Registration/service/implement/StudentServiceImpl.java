package com.student.Registration.service.implement;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.Registration.model.Student;
import com.student.Registration.repository.StudentRepository;
import com.student.Registration.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public Iterable<Student> getAllStudent() {
		Iterable <Student> stud = studentRepository.findAll();
		return stud;
	}
	
	@Override
	public void addStudent(Student student){
		studentRepository.save(student);
	}

	@Override
	public Optional<Student> getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
//	@Override
//	public Optional<Student> getById(long id) {
//		Optional<Student> st = studentRepository.findById(id);
//		return st;
//	}

}
