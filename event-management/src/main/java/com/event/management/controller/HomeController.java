package com.event.management.controller;

import com.event.management.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    private ServicesService servicesService;
    
    
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("serviceList", servicesService.getAllServices());
        return "index";
    }
    
    @GetMapping("/about")
    public String aboutUs(Model model) {
        model.addAttribute("serviceList", servicesService.getAllServices());
        return "/pages/about";
    }
    
    @GetMapping("/testimonial")
    public String testimonial(Model model) {
        model.addAttribute("serviceList", servicesService.getAllServices());
        return "/pages/testimonial";
    }
    
    
    @GetMapping("/gallery")
    public String gallery(Model model) {
        model.addAttribute("serviceList", servicesService.getAllServices());
        return "/pages/gallery";
    }
    
}
