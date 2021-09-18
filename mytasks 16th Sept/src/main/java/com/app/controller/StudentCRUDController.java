package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.service.StudentCRUDService;

@RestController
public class StudentCRUDController {

	@Autowired
	private StudentCRUDService service ;
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		// TODO Auto-generated method stub
		return service.addStudent(student);
	}
	
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student student) {
		// TODO Auto-generated method stub
		return service.updateStudent(student) ;
	}
	
	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable int id) {
		// TODO Auto-generated method stub
		return service.getStudentById(id);
	}
	
	@DeleteMapping("/student/{id}")
	public void deleteStudent(@PathVariable int id) {
		// TODO Auto-generated method stub
		service.deleteStudent(id);
	}

}
