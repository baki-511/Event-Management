package com.event.management.exception;

public class TestimonialNotFoundException extends RuntimeException{
    public TestimonialNotFoundException(Long testimonialId) {
        super("Testimonial NOT Found With ID : " + testimonialId);
    }
}
