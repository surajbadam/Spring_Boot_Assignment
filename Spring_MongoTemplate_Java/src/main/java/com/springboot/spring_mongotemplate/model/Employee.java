package com.springboot.spring_mongotemplate.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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
