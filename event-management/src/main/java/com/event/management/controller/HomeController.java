package com.event.management.controller;

import com.event.management.entity.Gallery;
import com.event.management.service.GalleryService;
import com.event.management.service.ServicesService;
import com.event.management.service.TestimonialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class HomeController {
    @Autowired
    private ServicesService servicesService;
    
    @Autowired
    private TestimonialService testimonialService;
    
    @Autowired
    private GalleryService galleryService;
    
    
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("serviceList", servicesService.getAllServices());
        model.addAttribute("testimonials", testimonialService.getAllTestimonial());
        model.addAttribute("serviceSlides", servicesService.getAllServices());
        List<Gallery> fourGalleryImages = galleryService.getAllGallery().stream()
                .limit(4)
                .toList();
        model.addAttribute("fourGallery", fourGalleryImages);
        return "index";
    }
    
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    
    @GetMapping("/about")
    public String aboutUs(Model model) {
        model.addAttribute("serviceList", servicesService.getAllServices());
        return "/pages/about";
    }
    
    @GetMapping("/testimonial")
    public String testimonial(Model model) {
        model.addAttribute("serviceList", servicesService.getAllServices());
        model.addAttribute("testimonials", testimonialService.getAllTestimonial());
        return "/pages/testimonial";
    }
    
    
    @GetMapping("/gallery")
    public String gallery(Model model) {
        model.addAttribute("serviceList", servicesService.getAllServices());
        model.addAttribute("galleryImages", galleryService.getAllGallery());
        
        return "/pages/gallery";
    }
    
}
