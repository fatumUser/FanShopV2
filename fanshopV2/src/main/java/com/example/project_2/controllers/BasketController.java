package com.example.project_2.controllers;

import com.example.project_2.entitys.Message;
import com.example.project_2.entitys.Product;
import com.example.project_2.entitys.User;
import com.example.project_2.repositories.MessageRepository;
import com.example.project_2.repositories.ProductRepository;
import com.example.project_2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BasketController {
    @Autowired
    MessageRepository messageRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    UserRepository userRepository;

    @GetMapping("/basket")
    public String basket(Model model, @AuthenticationPrincipal User user) {
        Iterable<Message> messages = messageRepository.findAll();
        User user1 = userRepository.findByUsername(user.getUsername());
        model.addAttribute("messages", messages);
        model.addAttribute("products", user1.getProducts());
        model.addAttribute("user", user.getUsername());
        return "basket.html";
    }

}
