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
/*
  @Override
	public Iterable<Product> addProduct(Product product) {
		productRepository.save(product);
		Iterable<Product> products = productRepository.findAll();
		return products;
	}
	
	@Override
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
   
 */
	@Override 
	public Student getStudentById(long id) {       // this is from optional method
		Optional<Student> stdnt = studentRepository.findById(id);
		System.out.println("student : " + stdnt.get());
		
		if(stdnt.isPresent()) {
			Student st = stdnt.get();
			return st;
		}
		return stdnt.orElse(null);
	}
	

}
