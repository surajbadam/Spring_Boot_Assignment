package com.springboot.springbootfirstapp.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springbootfirstapp.model.Employee;
import com.springboot.springbootfirstapp.service.EmployeeService;

@RestController
public class EmpController {
	@Autowired
	private EmployeeService empservice;
	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee emp) {
		empservice.save(emp);
		return "added employee with id"+emp.getId();
	}
	@GetMapping("/getEmployee")
	public List<Employee> getAllEmployees(){
		return empservice.findAll();
	}
	
	@GetMapping("/getEmployee/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable int id) {
		return empservice.findById(id);
	}
}
