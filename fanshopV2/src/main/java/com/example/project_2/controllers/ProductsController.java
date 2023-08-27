package com.example.project_2.controllers;

import com.example.project_2.entitys.Product;
import com.example.project_2.entitys.User;
import com.example.project_2.repositories.ProductRepository;
import com.example.project_2.repositories.UserRepository;
import com.example.project_2.services.SchoolService;
import com.zaxxer.hikari.util.ClockSource;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.FetchType;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.persister.collection.mutation.UpdateRowsCoordinator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.logging.java.JavaLoggingSystem;
import org.springframework.boot.logging.log4j2.Log4J2LoggingSystem;
import org.springframework.boot.logging.logback.LogbackLoggingSystem;
import org.springframework.cglib.proxy.Factory;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductsController {
    @Autowired
    SessionFactory sessionFactory;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    SchoolService schoolService;

    @GetMapping("NikeAirMaxBlue")
    public String NikeAirMaxBlue(Model model, @AuthenticationPrincipal User user) {
        model.addAttribute("user", user.getUsername());
        return "NikeAirMaxBlue.html";
    }
    @PostMapping("addBasket1")
    public String addBasket(Model model, @AuthenticationPrincipal User user) {
        Product product = new Product();
        product.setTitle("Кроссовки Nike-SB-Dunk");
        product.setPrice(4200);
        product.setImg("/img/Nike-SB-Dunk-Green-Blue.jpg");

        User user1 = userRepository.findByUsername(user.getUsername());
        productRepository.save(product);
        user1.addProduct(product);
        user1.setValue("a");
        userRepository.save(user1);

        model.addAttribute("user", user.getUsername());
        return "main.html";
    }
    @GetMapping("FudbolkaVetements")
    public String FudbolkaVetements(Model model, @AuthenticationPrincipal User user) {
        model.addAttribute("user", user.getUsername());
        return "FudbolkaVetements.html";
    }
    @PostMapping("FudbolkaVetements")
    public String addFudbolkaVetements(Model model, @AuthenticationPrincipal User user) {
        Product product = new Product();
        product.setTitle("Футболка Vetements");
        product.setPrice(12000);
        product.setImg("/img/Vetemens_Футболка.jpg");

        User user1 = userRepository.findByUsername(user.getUsername());
        productRepository.save(product);
        user1.addProduct(product);
        user1.setValue("a");
        userRepository.save(user1);

        model.addAttribute("user", "None");
        return "main.html";
    }
    @GetMapping("BalenciagaKrossovki")
    public String BalenciagaKrossovki(Model model, @AuthenticationPrincipal User user) {
        model.addAttribute("user", user.getUsername());
        return "products/BalenciagaKrossovki.html";
    }
    @PostMapping("BalenciagaKrossovki")
    public String addBalenciagaKrossovki(Model model, @AuthenticationPrincipal User user) {
        Product product = new Product();
        product.setTitle("Кроссовки BALENCIAGA");
        product.setPrice(43000);
        product.setImg("/img/BALENCIAGA_krossovki_Drive.jpg");

        User user1 = userRepository.findByUsername(user.getUsername());
        productRepository.save(product);
        user1.addProduct(product);
        user1.setValue("a");
        userRepository.save(user1);

        model.addAttribute("user", user.getUsername());
        return "main.html";
    }
    @GetMapping("BurberryFutbolka")
    public String BurberryFutbolka(Model model, @AuthenticationPrincipal User user) {
        model.addAttribute("user", user.getUsername());
        return "products/BurberryFutbolka.html";
    }
    @PostMapping("BurberryFutbolka")
    public String addBurberryFutbolka(Model model, @AuthenticationPrincipal User user) {
        Product product = new Product();
        product.setTitle("Футболка BURBERRY");
        product.setPrice(68000);
        product.setImg("/img/BURBERRY_futbolka.jpg");

        User user1 = userRepository.findByUsername(user.getUsername());
        productRepository.save(product);
        user1.addProduct(product);
        user1.setValue("a");
        userRepository.save(user1);

        model.addAttribute("user", user.getUsername());
        return "main.html";
    }
    @GetMapping("BurberryKedi")
    public String BurberryKedi(Model model, @AuthenticationPrincipal User user) {
        model.addAttribute("user", user.getUsername());
        return "products/BurberryKedi.html";
    }
    @PostMapping("BurberryKedi")
    public String addBurberryKedi(Model model, @AuthenticationPrincipal User user) {
        Product product = new Product();
        product.setTitle("Кеды BURBERRY");
        product.setPrice(115000);
        product.setImg("/img/BURBERRY_KEDI.jpg");

        User user1 = userRepository.findByUsername(user.getUsername());
        productRepository.save(product);
        user1.addProduct(product);
        user1.setValue("a");
        userRepository.save(user1);

        model.addAttribute("user", user.getUsername());
        return "main.html";
    }
    @GetMapping("DolceGabbanaFutbolka")
    public String DolceGabbanaFutbolka(Model model, @AuthenticationPrincipal User user) {
        model.addAttribute("user", user.getUsername());
        return "products/DolceGabbanaFutbolka.html";
    }
    @PostMapping("DolceGabbanaFutbolka")
    public String addDolceGabbanaFutbolka(Model model, @AuthenticationPrincipal User user) {
        Product product = new Product();
        product.setTitle("Футболка DOLCE-GABBANA");
        product.setPrice(55000);
        product.setImg("/img/DOLCE-GABBANA_futbolka.jpg");

        User user1 = userRepository.findByUsername(user.getUsername());
        productRepository.save(product);
        user1.addProduct(product);
        user1.setValue("a");
        userRepository.save(user1);

        model.addAttribute("user", user.getUsername());
        return "main.html";
    }
    @GetMapping("DolceGabbanaSwitshot")
    public String DolceGabbanaSwitshot(Model model, @AuthenticationPrincipal User user) {
        model.addAttribute("user", user.getUsername());
        return "products/DolceGabbanaSwitshot.html";
    }
    @PostMapping("DolceGabbanaSwitshot")
    public String addDolceGabbanaSwitshot(Model model, @AuthenticationPrincipal User user) {
        Product product = new Product();
        product.setTitle("Свитшот DOLCE-GABBANA");
        product.setPrice(88000);
        product.setImg("/img/DOLCE-GABBANA_switshot.jpg");

        User user1 = userRepository.findByUsername(user.getUsername());
        productRepository.save(product);
        user1.addProduct(product);
        user1.setValue("a");
        userRepository.save(user1);

        model.addAttribute("user", user.getUsername());
        return "main.html";
    }
    @GetMapping("DolceGabbanaSumka")
    public String DolceGabbanaSumka(Model model, @AuthenticationPrincipal User user) {
        model.addAttribute("user", user.getUsername());
        return "products/DolceGabbanaSumka.html";
    }
    @PostMapping("DolceGabbanaSumka")
    public String addDolceGabbanaSumka(Model model, @AuthenticationPrincipal User user) {
        Product product = new Product();
        product.setTitle("Сумка DOLCE-GABBANA");
        product.setPrice(75000);
        product.setImg("/img/DOLCE-GABBANA_sumka.jpg");

        User user1 = userRepository.findByUsername(user.getUsername());
        productRepository.save(product);
        user1.addProduct(product);
        user1.setValue("a");
        userRepository.save(user1);

        model.addAttribute("user", user.getUsername());
        return "main.html";
    }
    @GetMapping("GucciKedi")
    public String GucciKedi(Model model, @AuthenticationPrincipal User user) {
        model.addAttribute("user", user.getUsername());
        return "products/GucciKedi.html";
    }
    @PostMapping("GucciKedi")
    public String addGucciKedi(Model model, @AuthenticationPrincipal User user) {
        Product product = new Product();
        product.setTitle("Кеды GUCCI");
        product.setPrice(95000);
        product.setImg("/img/GUCCI_kedi_tennis1977.jpg");

        User user1 = userRepository.findByUsername(user.getUsername());
        productRepository.save(product);
        user1.addProduct(product);
        user1.setValue("a");
        userRepository.save(user1);

        model.addAttribute("user", user.getUsername());
        return "main.html";
    }
}
