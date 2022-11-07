package com.QA.QuestionnaireAssessment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.QA.QuestionnaireAssessment.models.Answer;
import com.QA.QuestionnaireAssessment.repositories.IAnswersRepository;

@Service
public class AnswerService {
	
	private final IAnswersRepository answerRepository;
	
	@Autowired
	public AnswerService(IAnswersRepository answerRepository) {
		this.answerRepository = answerRepository;
	}
	
	public List<Answer> getAllAnser(){
		return answerRepository.findAll();
	}
	
//	public List<Answer> getAllAnswers_QuestionId(Long questionId){
//		return answerRepository.getAllAnswerByQuestion(questionId);
//	}
	

}
