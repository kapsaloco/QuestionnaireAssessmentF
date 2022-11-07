package com.QA.QuestionnaireAssessment.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.QA.QuestionnaireAssessment.models.Users;
import com.QA.QuestionnaireAssessment.repositories.IUsersRepository;

@Service
public class UsersService {
	
	private IUsersRepository userRepository;
	
	@Autowired
	public UsersService(IUsersRepository userRepository){
		this.userRepository = userRepository;
	}
	
	
	//@Transactional(readOnly = true)
	public List<Users> findAll() {
		return userRepository.findAll();
	}
	
	public Optional<Users> findById(long userId) {
		
		return userRepository.findById(userId);
	}
	
	public Users save(Users user) {
		
		return userRepository.save(user);
	}
	
	public void delete(long userId) {
		
		userRepository.deleteById(userId);
	}
	
	
}
