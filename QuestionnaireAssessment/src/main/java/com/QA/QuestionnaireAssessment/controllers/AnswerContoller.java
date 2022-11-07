package com.QA.QuestionnaireAssessment.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.QA.QuestionnaireAssessment.models.Answer;
import com.QA.QuestionnaireAssessment.models.Question;
import com.QA.QuestionnaireAssessment.services.AnswerService;

@RestController
@RequestMapping(path="/api/")
public class AnswerContoller {

	private final AnswerService service;
	
	@Autowired
	public AnswerContoller(AnswerService service) {
		this.service = service;
	}
	
	@GetMapping("all/answers")
	public List <Answer> getAllAnswer(){
		return service.getAllAnser();
	}
	
	
}
