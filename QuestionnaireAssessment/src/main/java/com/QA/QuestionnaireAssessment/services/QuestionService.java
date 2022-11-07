package com.QA.QuestionnaireAssessment.services;

import com.QA.QuestionnaireAssessment.models.Question;
import com.QA.QuestionnaireAssessment.repositories.IQuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private IQuestionsRepository questionsRepository;


    public List<Question> getAllPLaces(){
        return questionsRepository.findAll();
    }

    public Question addFixedQuestion(Question question) {
        Question newquestion = new Question("How many times you hit the gym broski?");
        return questionsRepository.save(newquestion);
    }
}