package com.spring.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.model.Employee;
import com.spring.demo.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository repository;
	
	@PostMapping("/addEmployee")
	public String saveEmployee(@RequestBody Employee employee) {
		    System.out.println(employee.toString());
           repository.save(employee);
	      return "Added Employee";
}
	@GetMapping("/findAllEmployees")
	public List<Employee> getEmployees(){
		return repository.findAll();
	}
	
	@GetMapping("/findEmployeeById/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable int id){
		return repository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id) {
		repository.deleteById(id);
		return "Employee deleted";
	}
	
	
	}
