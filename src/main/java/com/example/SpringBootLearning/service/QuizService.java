package com.example.SpringBootLearning.service;

import com.example.SpringBootLearning.dao.QuestionsDAO;
import com.example.SpringBootLearning.dao.QuizDAO;
import com.example.SpringBootLearning.model.Maths_Questions;
import com.example.SpringBootLearning.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    @Autowired
    QuizDAO quizDAO;

    @Autowired
    QuestionsDAO questionsDAO;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
        try{
            List<Maths_Questions> quiz_questions=questionsDAO.findRandomQuestionsByCategory(category,numQ);
            Quiz quiz=new Quiz();
            quiz.setTitle(title);
            quiz.setMaths_questions(quiz_questions);
            quizDAO.save(quiz);
            return new ResponseEntity<>("New Quiz has created !!", HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }
}
