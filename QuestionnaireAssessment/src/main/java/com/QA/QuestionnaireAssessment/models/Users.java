package com.QA.QuestionnaireAssessment.models;

import lombok.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column
	private long uId;
	
	@Column
	@NonNull
	private String email;
	
	@Column
	private String password;

	
	public Users() {
		
	}
	
	public Users(@NonNull String email, String password) {
		this.email = email;
		this.password = password;
	}
	public Users(long uId, @NonNull String email, String password) {
		this.uId=uId;
		this.email=email;
		this.password=password;
	}

	public long getuId() {
		return uId;
	}

	public void setuId(long uId) {
		this.uId = uId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Users{" +
				"uId=" + uId +
				", email='" + email + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}
