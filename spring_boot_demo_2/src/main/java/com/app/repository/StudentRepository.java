package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

	List<Student> findByEmailId(int emailId) ;
	List<Student> findByName(String name) ;
	List<Student> findByEmailId(String emailId) ;
	List<Student> findByCity(String city) ;
}
