package com.example.demo.controller;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.model.Student;

@Controller
public class StudentController {

    @GetMapping("/students")
    public String showStudents(Model model) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1L, "Test 1", "a@gmail.com"));
        students.add(new Student(2L, "Test 2", "b@gmail.com"));

        model.addAttribute("students", students);

        return "students";
    }
}