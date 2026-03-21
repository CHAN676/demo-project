package com.example.demo.controller;

import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository repo;

    @GetMapping("/students")
    public String showStudents(Model model) {
        model.addAttribute("students", repo.findAll());
        return "students";
    }
}