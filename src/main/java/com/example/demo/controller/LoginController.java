package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    // Show login page
    @GetMapping("/login")
    public String showLogin() {
        return "login";
    }

    // Process login WITHOUT database
    @PostMapping("/login")
    public String processLogin(@RequestParam String username,
                               @RequestParam String password,
                               Model model) {

        // Temporary login (no DB)
        if(username.equals("admin") && password.equals("admin")) {
            return "redirect:/dashboard";   // success
        } else {
            model.addAttribute("error", "Invalid Username or Password");
            return "login";                 // failure
        }
    }
}