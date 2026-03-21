
package com.example.demo.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Student;

@Controller
public class StudentController {

    // ✅ HOME PAGE
    @GetMapping("/")
    public String home() {
        return "home";
    }

    // ✅ STUDENTS PAGE (NO DATABASE)
    @GetMapping("/students")
    public String showStudents(Model model) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1L, "Test Student 1", "test1@gmail.com"));
        students.add(new Student(2L, "Test Student 2", "test2@gmail.com"));

        model.addAttribute("students", students);

        return "students";
    }
}