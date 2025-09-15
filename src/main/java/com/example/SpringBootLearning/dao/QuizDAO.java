package com.example.SpringBootLearning.dao;

import com.example.SpringBootLearning.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDAO extends JpaRepository<Quiz,Integer> {
}
