package com.example.SpringBootLearning.dao;

import com.example.SpringBootLearning.model.Maths_Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionsDAO extends JpaRepository<Maths_Questions,Integer> {

    List<Maths_Questions> findByCategory(String category);

    @Query(value = "SELECT * FROM maths_questions WHERE category = :category ORDER BY RAND() LIMIT :numQ", nativeQuery = true)
    List<Maths_Questions> findRandomQuestionsByCategory(String category, int numQ);
}
