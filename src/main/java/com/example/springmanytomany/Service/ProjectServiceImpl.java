package com.example.springmanytomany.Service;

import com.example.springmanytomany.Entity.Project;
import com.example.springmanytomany.Repo.projectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private projectRepo projectRepo;
    @Override
    public List<Project> getProject() {
        return projectRepo.findAll();
    }

    @Override
    public Project getProject(Integer projectId) {
        return projectRepo.findById(projectId).get();
    }

    @Override
    public Project addProject(Project project) {
        return projectRepo.save(project);
    }

    @Override
    public void deleteProject(Integer projectId) {
    Project p = projectRepo.getById(projectId);
   this.projectRepo.delete(p);
    }

    @Override
    public Project updateProject(Project project, Integer projectId) {
        Project p = projectRepo.getById(projectId);
        p.setId(project.getId());
        p.setName(project.getName());
        return this.projectRepo.save(p);

     }
}
