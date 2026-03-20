package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.repository.StudentRepository;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository repo;

    // ✅ HOME PAGE
    @GetMapping("/")
    public String home() {
        return "home";
    }

    // ✅ STUDENTS PAGE
    @GetMapping("/students")
    public String showStudents(Model model) {
        model.addAttribute("students", repo.findAll());
        return "students";
    }
}