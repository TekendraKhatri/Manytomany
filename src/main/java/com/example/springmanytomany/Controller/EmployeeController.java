package com.example.springmanytomany.Controller;

import com.example.springmanytomany.Entity.Employee;
import com.example.springmanytomany.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping( "/employee")
    public List<Employee> getEmployee(){
        return this.employeeService.getEmployee();
    }

    @GetMapping("/employee/{employeeId}")

    public Employee getEmployee(@PathVariable String employeeId){
        return this.employeeService.getEmployee(Integer.parseInt(employeeId));
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee){
        return this.employeeService.addEmployee(employee);
    }

    //to delete a course
    @DeleteMapping("/employee/{employeeId}")
    public  void deleteEmployee(@PathVariable Integer employeeId){
        this.employeeService.deleteEmployee(employeeId);
    }

    // to update the  course
    @PutMapping("/employee/{employeeId}")
    public Employee updateEmployee( @RequestBody Employee employee,@PathVariable Integer employeeId){
        return this.employeeService.updateEmployee(employee,employeeId);
    }
}

