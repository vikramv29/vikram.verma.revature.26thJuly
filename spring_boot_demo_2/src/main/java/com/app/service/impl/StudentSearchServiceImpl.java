package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Student;
import com.app.repository.StudentRepository;
import com.app.service.StudentSearchService;

@Service
public class StudentSearchServiceImpl implements StudentSearchService {

	@Autowired
	private StudentRepository repository;

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Student> getAllStudentsByName(String name) {
		// TODO Auto-generated method stub
		return repository.findByName(name);
	}

	@Override
	public List<Student> getAllStudentsByCity(String city) {
		// TODO Auto-generated method stub
		return repository.findByCity(city);
	}

	@Override
	public List<Student> getAllStudentsByEmailId(String emailId) {
		// TODO Auto-generated method stub
		return repository.findByEmailId(emailId);
	}

}
