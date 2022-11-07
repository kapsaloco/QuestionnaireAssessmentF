package com.QA.QuestionnaireAssessment.repositories;

import com.QA.QuestionnaireAssessment.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IQuestionsRepository extends JpaRepository<Question, Long>{
}

