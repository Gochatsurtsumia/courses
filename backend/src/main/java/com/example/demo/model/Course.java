package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name="courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Double price;
    private Integer capacity;
}
