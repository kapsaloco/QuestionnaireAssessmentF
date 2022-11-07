package com.QA.QuestionnaireAssessment.repositories;

import com.QA.QuestionnaireAssessment.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsersInterface extends JpaRepository<Users, Long> {
}
