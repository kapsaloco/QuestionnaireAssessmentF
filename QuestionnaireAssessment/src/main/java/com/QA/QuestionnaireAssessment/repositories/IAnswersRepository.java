package com.QA.QuestionnaireAssessment.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.QA.QuestionnaireAssessment.models.Answer;

@Repository
public interface IAnswersRepository extends JpaRepository<Answer, Long>{
	
	public List<Answer> getAllAnswerByQuestion(Long Id);
	public List<Answer> getAllAnswerByQuestionQuestion(String question);

}
