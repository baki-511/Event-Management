package com.event.management.rest;

import com.event.management.entity.ContactUs;
import com.event.management.payload.ApiResponse;
import com.event.management.service.ContactUsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactUsRestController {
    @Autowired
    private ContactUsService contactUsService;
    
    
    @PostMapping("/save")
    public ResponseEntity<ContactUs> saveContactUs(@RequestBody ContactUs contactUs) {
        return new ResponseEntity<>(contactUsService.addContactUs(contactUs), HttpStatus.CREATED);
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<ContactUs>> getAllContactUs() {
        return new ResponseEntity<>(contactUsService.getAllContactUs(), HttpStatus.OK);
    }
    
    @GetMapping("/{contactUsId}")
    public ResponseEntity<ContactUs> getContactUsById(@PathVariable Long contactUsId) {
        return new ResponseEntity<>(contactUsService.getContactUsById(contactUsId), HttpStatus.OK);
    }
    
    @DeleteMapping("/{contactUsId}")
    public ResponseEntity<ApiResponse> deleteContactUsById(@PathVariable Long contactUsId) {
        return new ResponseEntity<>(contactUsService.deleteContactUs(contactUsId), HttpStatus.OK);
    }
    
    @PutMapping("/update")
    public ResponseEntity<ContactUs> updateContactUs(@RequestBody ContactUs contactUs) {
        return new ResponseEntity<>(contactUsService.updateContactUs(contactUs), HttpStatus.OK);
    }
}
