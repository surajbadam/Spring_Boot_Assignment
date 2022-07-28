package com.springboot.spring_mongotemplate.Controller;

import com.springboot.spring_mongotemplate.Service.EmployeeService;
import com.springboot.spring_mongotemplate.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @RequestMapping(value = "/addNew",method = RequestMethod.POST)
    public Employee save(@RequestBody Employee emp){
        return employeeService.save(emp);
    }
    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public List<Employee> getAll(){
        return employeeService.getAll();
    }
    @RequestMapping(value = "/getById/{id}",method = RequestMethod.GET)
    public Employee getById(@PathVariable int id){
        return employeeService.getById(id);
    }
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public Employee update(@RequestBody Employee emp)
    {
        return employeeService.update(emp);
    }
    @RequestMapping(value = "/updateName/{id}",method = RequestMethod.PUT)
    public Employee updateName(@PathVariable int id,@RequestParam("name") String name)
    {
        return employeeService.updateName(id,name);
    }
    @RequestMapping(value = "/updatePosition/{id}",method = RequestMethod.PUT)
    public Employee updatePosition(@PathVariable int id,@RequestParam("position") String position)
    {
        return employeeService.updatePosition(id,position);
    }
    @RequestMapping(value = "/updateSalary/{id}",method = RequestMethod.PUT)
    public Employee updateSalary(@PathVariable int id,@RequestParam("salary") int salary)
    {
        return employeeService.updateSalary(id,salary);
    }
    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public long delete(@RequestBody Employee emp){
        return employeeService.delete(emp);
    }
}
