package com.event.management.service;

import com.event.management.entity.Services;
import com.event.management.payload.ApiResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ServicesService {
    Services addService(Services services, MultipartFile file);
    
    List<Services> getAllServices();
    
    Services getServiceById(Long serviceId);
    
    ApiResponse deleteServiceById(Long serviceId);
    
    Services updateService(Services services, MultipartFile file);
}
