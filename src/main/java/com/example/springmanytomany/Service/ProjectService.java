package com.example.springmanytomany.Service;

import com.example.springmanytomany.Entity.Project;

import java.util.List;

public interface ProjectService {
    public List<Project> getProject();

    public Project getProject(Integer projectId);

    public Project addProject(Project project);

    public void deleteProject (Integer projectId);

    public  Project  updateProject (Project project, Integer projectId);

}
