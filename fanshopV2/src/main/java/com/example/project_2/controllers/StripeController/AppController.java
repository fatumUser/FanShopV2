package com.example.project_2.controllers.StripeController;

import com.example.project_2.entitys.stripeEntitys.Request;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {

    @Value("${stripe.api.publicKey}")
    private String stripePublicKey;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("request", new Request());
        return "stripePayments/index.html";
    }

    @PostMapping("/")
    public String showCard(@ModelAttribute Request request,
                           BindingResult bindingResult,
                           Model model){
        if (bindingResult.hasErrors()){
            return "stripePayments/index";
        }
        model.addAttribute("publicKey", stripePublicKey);
        model.addAttribute("amount", request.getAmount());
        model.addAttribute("email", request.getEmail());
        model.addAttribute("productName", request.getProductName());
        return "stripePayments/checkout.html";
    }
}
