package com.web.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Employee {
    @Id
    private int id;
    private String name;
    private Float salary;
    @OneToOne
    @JoinColumn(name="add_id")
    private Address address;

    @OneToOne
    @JoinColumn(name = "par_id")
    private ParkingSpace parkingSpace;

    @ManyToOne
    @JoinColumn(name = "dep_id")
    private Department department;

    @ManyToMany
    @JoinTable(name = "emp_pro",
            joinColumns = @JoinColumn(name = "emp_id"),
            inverseJoinColumns = @JoinColumn(name = "pro_id")
    )
    private Collection<Project> projects;

    public Employee(){}

    public Employee(int id){
        this.id = id;
    }

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

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ParkingSpace getParkingSpace() {
        return parkingSpace;
    }

    public void setParkingSpace(ParkingSpace parkingSpace) {
        this.parkingSpace = parkingSpace;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Collection<Project> getProjects() {
        return projects;
    }

    public void setProjects(Collection<Project> projects) {
        this.projects = projects;
    }
}
