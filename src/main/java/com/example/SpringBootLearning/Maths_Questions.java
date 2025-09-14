package com.example.SpringBootLearning;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Maths_Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String category;
    private String question;
    private String Option_1;
    private String Option_2;
    private String Option_3;
    private String Option_4;
}
