package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student_details")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int student_id;

    private String name;
    private double cgpa;
    private double total_fees;
    private double remaining_fees;

    // getters and setters

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getTotal_fees() {
        return total_fees;
    }

    public void setTotal_fees(double total_fees) {
        this.total_fees = total_fees;
    }

    public double getRemaining_fees() {
        return remaining_fees;
    }

    public void setRemaining_fees(double remaining_fees) {
        this.remaining_fees = remaining_fees;
    }
}