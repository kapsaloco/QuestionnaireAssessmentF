package com.QA.QuestionnaireAssessment.controllers;

import com.QA.QuestionnaireAssessment.models.Question;
import com.QA.QuestionnaireAssessment.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/getall")
    public List<Question> getAllPLaces(){
        return questionService.getAllPLaces();
    }

    @PostMapping("/addone")
    public Question addFixedQuestion(Question question){
        return questionService.addFixedQuestion(question);
    }

    @GetMapping("/get/{qId}")
    public Question getQuestion(@PathVariable long qId){
        return questionService.getQuestion(qId);
    }
}
