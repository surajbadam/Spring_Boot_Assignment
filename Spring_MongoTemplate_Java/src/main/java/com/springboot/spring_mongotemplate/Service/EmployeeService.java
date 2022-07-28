package com.springboot.spring_mongotemplate.Service;

import com.springboot.spring_mongotemplate.Repository.EmployeeRepository;
import com.springboot.spring_mongotemplate.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class EmployeeService {
    Scanner sc=new Scanner(System.in);
    @Autowired
    EmployeeRepository employeeRepository;
    public Employee save(Employee emp) {
        return employeeRepository.save(emp);
    }

    public List<Employee> getAll() {
        return employeeRepository.find();
    }

    public Employee getById(int id) {
        return employeeRepository.getById(id);
    }

    public Employee update(Employee emp) {
        return employeeRepository.save(emp);
    }


    public Employee updateName(int id,String name) {
        Employee emp=getById(id);
        emp.setName(name);
        save(emp);
        return emp;
    }

    public Employee updatePosition(int id, String position) {
        Employee emp=getById(id);
        emp.setPosition(position);
        save(emp);
        return emp;
    }

    public Employee updateSalary(int id, int salary) {
        Employee emp=getById(id);
        emp.setSalary(salary);
        save(emp);
        return emp;
    }

    public long delete(Employee emp) {
        return employeeRepository.delete(emp);
    }
}
