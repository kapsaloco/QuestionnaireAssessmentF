package com.QA.QuestionnaireAssessment.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.QA.QuestionnaireAssessment.models.Users;

@Repository
public interface IUsersRepository extends JpaRepository<Users, Long> {
	
	public List<Users> findAll();
	
	public Optional<Users> findById(Long uId);
	
	public Users save(Users user);
	
	public void deleteById(Long uId);
}
