package com.QA.QuestionnaireAssessment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.QA.QuestionnaireAssessment.models.Question;

@Repository
public interface IQuestionsRepository extends JpaRepository<Question, Long>{
}

