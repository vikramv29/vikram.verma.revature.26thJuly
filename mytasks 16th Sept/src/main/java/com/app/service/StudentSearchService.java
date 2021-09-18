package com.app.service;

import java.util.List;

import com.app.model.Student;

public interface StudentSearchService {
	List<Student> getAllStudents();

	List<Student> getAllStudentsByName(String name);

	List<Student> getAllStudentsByCity(String city);

	List<Student> getAllStudentsByEmailId(String emailId);

}
