package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.repository.UserRepository;
import com.example.demo.model.User;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepo;

    // Show login page
    @GetMapping("/login")
    public String showLogin() {
        return "login";
    }

    // Process login using DB
    @PostMapping("/login")
    public String processLogin(@RequestParam String username,
                               @RequestParam String password,
                               Model model) {

        User user = userRepo.loginUser(username, password);

        if(user != null) {
            return "redirect:/dashboard";   // success
        } else {
            model.addAttribute("error", "Invalid Username or Password");
            return "login";                 // failure
        }
    }
}