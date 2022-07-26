package com.springboot.springbootfirstapp.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.springbootfirstapp.model.Employee;

public interface EmployeeService extends MongoRepository<Employee,Integer> {

}
