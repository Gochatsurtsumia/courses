package com.example.demo.controller;

import com.example.demo.dto.EnrollmentRequest;
import com.example.demo.dto.EnrollmentResponse;
import com.example.demo.service.EnrollmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/enrollments")
@RequiredArgsConstructor
public class EnrollmentController {

    private final EnrollmentService enrollmentService;

    @PostMapping
    public EnrollmentResponse enroll(@RequestBody EnrollmentRequest request) {
        return enrollmentService.enroll(request.getUserId(), request.getCourseId());
    }

    @GetMapping("/user/{userId}")
    public List<EnrollmentResponse> getEnrollmentsByUser(@PathVariable Long userId) {
        return enrollmentService.getEnrollmentsByUser(userId);
    }

    @DeleteMapping("/{id}")
    public void unenroll(@PathVariable Long id) {
        enrollmentService.unenroll(id);
    }
}