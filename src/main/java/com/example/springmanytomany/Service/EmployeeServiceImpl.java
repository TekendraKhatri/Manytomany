package com.example.springmanytomany.Service;

import com.example.springmanytomany.Entity.Employee;
import com.example.springmanytomany.Repo.employeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
@Autowired
    private employeeRepo  employeeRepo;
    @Override
    public List<Employee> getEmployee() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee getEmployee(Integer employeeId) {
        return employeeRepo.findById(employeeId).get();

    }

    // for adding
    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public void deleteEmployee(Integer EmployeeId) {
        Employee c = employeeRepo.getById(EmployeeId);
        this.employeeRepo.delete(c);
    }

    @Override
    public Employee updateEmployee(Employee employee, Integer employeeId) {
        Employee c = employeeRepo.getById(employeeId);
        c.setId(employee.getId());
        c.setName(employee.getName());
        return this.employeeRepo.save(c);
    }
}



