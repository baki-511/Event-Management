package com.event.management.controller;

import com.event.management.entity.ContactUs;
import com.event.management.service.ContactUsService;
import com.event.management.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/contact")
public class ContactUsController {
    @Autowired
    private ContactUsService contactUsService;
    
    @Autowired
    private ServicesService servicesService;
    
    @GetMapping("")
    public String contactUs(Model model) {
        model.addAttribute("serviceList", servicesService.getAllServices());
        return "/pages/contact";
    }
   
    @PostMapping("/save")
    public String saveContact(@ModelAttribute ContactUs contactUs) {
        contactUsService.addContactUs(contactUs);
        return "redirect:/contact";
    }
}
