package com.event.management.service;

import com.event.management.entity.Gallery;
import com.event.management.payload.ApiResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface GalleryService {
    Gallery addGallery(MultipartFile file);
    
    List<Gallery> getAllGallery();
    
    Gallery getGalleryById(Long galleryId);
    
    ApiResponse deleteGalleryById(Long galleryId);
    
}
