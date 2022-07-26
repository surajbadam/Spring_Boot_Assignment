package com.springboot.springbootfirstapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Document(collection="Employee")
@ToString
public class Employee {
	@Id
	private int id;
	private String name;
	private String position;
	private int salary;
	
}
