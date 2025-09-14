package com.example.SpringBootLearning.controller;

import com.example.SpringBootLearning.Maths_Questions;
import com.example.SpringBootLearning.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("questions")
public class QusetionsController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allquestions")
    public List<Maths_Questions> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("easyquestions")
    public  List<Maths_Questions> getEasyQuestions(){
        return questionService.getEasyQuestions();
    }
}
