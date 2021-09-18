package com.app.service;

import com.app.model.Student;

public interface StudentCRUDService {
	Student addStudent(Student student);
	Student updateStudent(Student student);
	Student getStudentById(int id);
	void deleteStudent(int id);
}
