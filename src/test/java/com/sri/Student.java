package com.sri;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private String course;
    private double marks;
    private boolean feespaid;
    
    public Student(String name, int age, String course, double marks, boolean feesPaid) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
        this.feespaid = feesPaid;
    }


    public Student(Student student) {
        this.id = student.id;
        this.name = student.name;
        this.age = student.age;
        this.course = student.course;
        this.marks = student.marks;
        this.feespaid = student.feespaid;
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public double getMarks() {
        return marks;
    }
    public void setMarks(double marks) {
        this.marks = marks;
    }
    public boolean isFeespaid() {
        return feespaid;
    }
    public void setFeespaid(boolean feespaid) {
        this.feespaid = feespaid;
    }
    
}
