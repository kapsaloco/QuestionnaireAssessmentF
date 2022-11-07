package com.QA.QuestionnaireAssessment;

import com.QA.QuestionnaireAssessment.models.Question;
import com.QA.QuestionnaireAssessment.services.QuestionService;
import com.QA.QuestionnaireAssessment.services.UsersService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class QuestionTest {

    @Autowired
    private QuestionService questionService;

    @Test
    public void getAllQuestions_WhenCalled_ReturnAllQuestions(){
        List<Question> list =questionService.getAllPLaces();
        Assertions.assertTrue(0 < list.size());
    }
    @Test
    public void AddOneFixedQuestion_AssertListSizes(){
        List<Question> list = questionService.getAllPLaces();
        //size of current list
        int listsize = list.size();
        Question newq = new Question("Test Question");
        questionService.addFixedQuestion(newq);
        //new list
        list = questionService.getAllPLaces();
        int listsize2 = list.size();
        Assertions.assertTrue(listsize < listsize2);
    }

    @Test
    public void GetOne_AssertISNotNull(){
        Question question = questionService.getQuestion(1);
        Assertions.assertNotNull(question);
    }

}
