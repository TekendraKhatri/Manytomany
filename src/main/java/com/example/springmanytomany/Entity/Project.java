package com.example.springmanytomany.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Getter
@Setter
@Entity
@Table
public class Project {
    @Id
    private int id;
    private  String name;

    @ManyToMany(mappedBy = "project")
    Set<Employee> employeeSet;

     public Project(int id, String name){
         super();
         this.id= id;
         this.name= name;
     }
     public  Project(){
         super();
     }
     @Override
    public String toString(){
         return "Project{" + "id=" + id + ", name ='" + name +'\'' + '}';
     }
}
