package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.service.StudentSearchService;

@RestController
public class StudentSearchController {

	@Autowired
	private StudentSearchService service;

	@GetMapping("/students")
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return service.getAllStudents();
	}

	@GetMapping("/students/name/{name}")
	public List<Student> getAllStudentsByName(@PathVariable String name) {
		// TODO Auto-generated method stub
		return service.getAllStudentsByName(name);
	}

	@GetMapping("/students/city/{city}")
	public List<Student> getAllStudentsByCity(@PathVariable String city) {
		// TODO Auto-generated method stub
		return service.getAllStudentsByCity(city);
	}

	@GetMapping("/students/emailId/{emailId}")
	public List<Student> getAllStudentsByEmailId(@PathVariable String emailId) {
		// TODO Auto-generated method stub
		return service.getAllStudentsByEmailId(emailId);
	}

}
