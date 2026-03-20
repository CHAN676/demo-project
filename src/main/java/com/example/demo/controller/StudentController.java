package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @GetMapping("/students")
    public String showStudents(Model model) {

        // Temporary dummy data (no database)
        List<String> students = new ArrayList<>();
        students.add("John");
        students.add("David");
        students.add("Chandru");

        model.addAttribute("students", students);

        return "students";
    }
}