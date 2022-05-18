package com.example.springmanytomany.Service;

import com.example.springmanytomany.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getEmployee();
    public  Employee getEmployee(Integer employeeId);
    public  Employee addEmployee(Employee employee);
    public  void deleteEmployee (Integer EmployeeId);
    public  Employee updateEmployee(Employee employee, Integer employeeId);
}
