package com.example.demo.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository repo;

    // Home page
    @GetMapping("/")
    public String home() {
        return "home";
    }

    // Students page
    @GetMapping("/students")
    public String showStudents(Model model) {

        List<Student> students = repo.findAll();

        // fallback if DB empty
        if (students == null || students.isEmpty()) {
            List<Student> test = new ArrayList<>();
            test.add(new Student(1, "Test Student 1", "test1@gmail.com"));
            test.add(new Student(2, "Test Student 2", "test2@gmail.com"));
            model.addAttribute("students", test);
        } else {
            model.addAttribute("students", students);
        }

        return "students";
    }
}