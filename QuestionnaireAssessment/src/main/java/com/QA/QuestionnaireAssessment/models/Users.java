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
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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

	public Users(@NonNull String email, String password) {
		this.email = email;
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
