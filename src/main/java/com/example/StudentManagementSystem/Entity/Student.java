package com.example.StudentManagementSystem.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="Student")
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="FirstName")
    private String FirstName;
    @Column(name="LastName")
    private String LastName;
    @Column(name = "Email")
    private String email;
    @Column(name = "Branch")
    private String Branch;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    public Student(int id, String firstName, String lastName, String email, String branch) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        this.email = email;
        Branch = branch;
    }
    public Student() {
    }

}
