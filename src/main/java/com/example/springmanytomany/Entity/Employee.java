package com.example.springmanytomany.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
@Getter
@Setter
public class Employee {
    @Id
    private  int id;
    private  String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "e_tab",
            joinColumns = { @JoinColumn(name = "e_id") },
            inverseJoinColumns = { @JoinColumn(name = "p_id") })
    private Set<Project> project;

    public  Employee (int id, String name){
        super();
        this.id= id;
        this.name = name;
    }
    public  Employee(){
        super();
    }
     @Override
    public String toString(){
        return "Employee{" + "id=" +id + ", name='" + name+ '\'' +'}';
     }
}
