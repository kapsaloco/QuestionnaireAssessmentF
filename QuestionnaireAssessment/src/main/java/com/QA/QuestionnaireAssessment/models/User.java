package com.QA.QuestionnaireAssessment.models;

import org.springframework.lang.NonNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name="User")
public class User {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long uId;
	
	@Column(unique = true)
	@NonNull
	private String email;
	
	@Column
	private String password;
	
	public User(Long uId, String email, String password) {
		this.uId= uId;
		this.email = email;
		this.password=password;
	}
	public User(Long uId, String email) {
		this.uId= uId;
		this.email = email;
		this.password=null;
	}
	
	public User(String email) {
		this.email = email;
	}
	
	public User() {
	}
	
}
