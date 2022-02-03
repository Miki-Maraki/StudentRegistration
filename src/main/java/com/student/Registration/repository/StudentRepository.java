package com.student.Registration.repository;

import org.springframework.data.repository.CrudRepository;

import com.student.Registration.model.Student;

//CrudRepository interface is come from JPA 
//we extend, bc we want to use all methods from CrudRepository
  

public interface StudentRepository extends CrudRepository<Student, Long>{
	 
	// Student refers model class, Table name and 
	// Long reperesent unique id/primary key

}
