package com.example.SpringBootLearning.service;

import com.example.SpringBootLearning.dao.QuestionsDAO;
import com.example.SpringBootLearning.model.Maths_Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionsDAO questionsDAO;

    public ResponseEntity<List<Maths_Questions>> getAllQuestions(){
        try{
            return new ResponseEntity<>(questionsDAO.findAll(),HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(new ArrayList<Maths_Questions>(),HttpStatus.BAD_GATEWAY);
        }
    }


    public ResponseEntity<String> addQuestion(Maths_Questions mathsQuestions) {
        try{
            questionsDAO.save(mathsQuestions);
            return new ResponseEntity<String>("Question got saved !!",HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<String>("question is not getting added !!",HttpStatus.BAD_GATEWAY);
        }
    }

    public ResponseEntity<List<Maths_Questions>> getQuestionByCategory(String category) {
       try{
           return new ResponseEntity<>(questionsDAO.findByCategory(category),HttpStatus.OK);
       }catch (Exception e){
           e.printStackTrace();
       }
       return new ResponseEntity<>(new ArrayList<Maths_Questions>(),HttpStatus.BAD_GATEWAY);
    }
}
