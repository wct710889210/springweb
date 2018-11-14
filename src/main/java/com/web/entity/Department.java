package com.web.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Department {
    @Id
    private int id;
    private String name;
    @OneToMany(mappedBy = "department")
    @Basic(fetch = FetchType.EAGER)
    private Collection<Employee> employees;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Collection<Employee> employees) {
        this.employees = employees;
    }
}
