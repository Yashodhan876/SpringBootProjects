package com.example.SpringBootLearning.dao;

import com.example.SpringBootLearning.Maths_Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionsDAO extends JpaRepository<Maths_Questions,Integer> {

    List<Maths_Questions> findByCategory(String category);
}
