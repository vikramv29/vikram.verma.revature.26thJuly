package com.app.model;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Student {

	@Id
	@GeneratedValue
	private int id ;
	private String name ;
	private String emailId ;
	private String city ;
}
