package com.example.demo.service;

import com.example.demo.model.Course;
import com.example.demo.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository courseRepository;
    public List<Course>getAllCourses(){
        return courseRepository.findAll();
    }
    public Course createCourse(Course course){
        return courseRepository.save(course);
    }
    public void deleteCourse(Long id){
        courseRepository.deleteById(id);
    }
}
