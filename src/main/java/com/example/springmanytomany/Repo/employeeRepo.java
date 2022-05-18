package com.example.springmanytomany.Repo;

import com.example.springmanytomany.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeeRepo extends JpaRepository<Employee, Integer> {
}
