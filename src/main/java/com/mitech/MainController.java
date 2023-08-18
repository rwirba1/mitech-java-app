package com.mitech;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    
    @GetMapping("/")
    public String greet() {
        return "Unleash Efficiency, Collaboration, and High-Quality Delivery.";
    }
}
