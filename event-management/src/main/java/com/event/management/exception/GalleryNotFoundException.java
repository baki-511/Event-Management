package com.event.management.exception;

public class GalleryNotFoundException extends RuntimeException{
    public GalleryNotFoundException(Long galleryId) {
        super("Gallery Image NOT Found With ID : " + galleryId);
    }
}
