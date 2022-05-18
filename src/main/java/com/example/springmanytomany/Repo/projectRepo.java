package com.example.springmanytomany.Repo;

import com.example.springmanytomany.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface projectRepo extends JpaRepository<Project , Integer> {
}
