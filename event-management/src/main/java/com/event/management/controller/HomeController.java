package com.event.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    
    @GetMapping("/")
    public String home() {
        return "index";
    }
    
    @GetMapping("/about")
    public String aboutUs() {
        return "/pages/about";
    }
    
    @GetMapping("/testimonial")
    public String testimonial() {
        return "/pages/testimonial";
    }
    
    @GetMapping("/contact")
    public String contactUs() {
        return "/pages/contact";
    }
    
    @GetMapping("/gallery")
    public String gallery() {
        return "/pages/gallery";
    }
    
}
