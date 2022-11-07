package com.QA.QuestionnaireAssessment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.QA.QuestionnaireAssessment.models.Users;

@Repository
public interface IUsersInterface extends JpaRepository<Users, Long> {
	
}
