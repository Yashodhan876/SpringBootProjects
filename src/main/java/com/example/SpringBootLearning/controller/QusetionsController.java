package com.example.SpringBootLearning.controller;

import com.example.SpringBootLearning.model.Maths_Questions;
import com.example.SpringBootLearning.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("questions")
public class QusetionsController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allquestions")
    public ResponseEntity<List<Maths_Questions>> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Maths_Questions mathsQuestions){
        return questionService.addQuestion(mathsQuestions);
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Maths_Questions>> getQuestionByCategory(@PathVariable String category){
        return questionService.getQuestionByCategory(category);
    }

}
