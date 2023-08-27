package com.example.project_2.controllers;

import com.example.project_2.entitys.User;
import com.example.project_2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/profile")
    public String profile(@AuthenticationPrincipal User user, Model model) {
        User user1 = userRepository.findByUsername(user.getUsername());
        model.addAttribute("username", user.getUsername());
        return "profile.html";
    }


}
