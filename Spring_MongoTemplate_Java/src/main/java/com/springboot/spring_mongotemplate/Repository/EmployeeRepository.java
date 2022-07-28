package com.springboot.spring_mongotemplate.Repository;

import com.springboot.spring_mongotemplate.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {
    @Autowired
    MongoTemplate mongoTemplate;

    public Employee save(Employee emp) {
        return mongoTemplate.save(emp);
    }

    public List<Employee> find() {
        return mongoTemplate.findAll(Employee.class);
    }

    public Employee getById(int id) {
        return mongoTemplate.findById(id,Employee.class);
    }

    public long delete(Employee emp) {
        return mongoTemplate.remove(emp).getDeletedCount();
    }
}
