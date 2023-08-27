package com.example.project_2.controllers;

import com.example.project_2.entitys.Message;
import com.example.project_2.entitys.User;
import com.example.project_2.repositories.*;
import com.example.project_2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @Autowired
    private MessageRepository messageRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;

    @GetMapping("/main")
    public String main(Model model, @AuthenticationPrincipal User user) {
        model.addAttribute("user", user.getUsername());
        return "main.html";
    }

    @PostMapping("addMessage")
    public String addMessage(@RequestParam String text, @RequestParam String tag,
                             @AuthenticationPrincipal User user
                             ) {
        Message message = new Message(text, tag, user);
        message.addNameAuthor();
        messageRepository.save(message);
        Iterable<Message> messages = messageRepository.findAll();
        return "main.html";
    }

    @PostMapping("filter")
    public String filter(@RequestParam String filter, Model model) {
        Iterable<Message> messages;
        if(filter != null && !filter.isEmpty()) {
            messages = messageRepository.findByTag(filter);
        }
        else {
            messages = messageRepository.findAll();
        }
        model.addAttribute("messages", messages);
        return "basket.html";
    }

}
