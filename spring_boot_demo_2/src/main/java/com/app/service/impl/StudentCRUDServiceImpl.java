package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import com.app.model.Student;
import com.app.repository.StudentRepository;
import com.app.service.StudentCRUDService;

@Service
public class StudentCRUDServiceImpl implements StudentCRUDService {

	@Autowired
	private StudentRepository repository;

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return repository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return repository.save(student);
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

}
