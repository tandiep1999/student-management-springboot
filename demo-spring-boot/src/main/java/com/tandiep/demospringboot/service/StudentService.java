package com.tandiep.demospringboot.service;

import java.util.List;

import com.tandiep.demospringboot.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	public List<Student> getAllStudents();
	
}
