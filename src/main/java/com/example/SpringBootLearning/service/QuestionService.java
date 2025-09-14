package com.example.SpringBootLearning.service;

import com.example.SpringBootLearning.dao.QuestionsDAO;
import com.example.SpringBootLearning.Maths_Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionsDAO questionsDAO;

    public List<Maths_Questions> getAllQuestions(){
      return questionsDAO.findAll();
    }

    public List<Maths_Questions> getEasyQuestions(){
        return questionsDAO.findByCategory("Easy");
    }



}
