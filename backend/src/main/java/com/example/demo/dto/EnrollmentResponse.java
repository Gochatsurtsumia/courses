package com.example.demo.dto;

import lombok.Data;

@Data
public class EnrollmentResponse {
    private Long id;
    private UserResponse user;
    private CourseResponse course;
}