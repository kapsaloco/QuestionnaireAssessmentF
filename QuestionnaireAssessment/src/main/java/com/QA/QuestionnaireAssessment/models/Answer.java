package com.QA.QuestionnaireAssessment.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

//import jakarta.persistence.Entity;
//import jakarta.persistence.Table;

@Entity
@Table
public class Answer {
	@Id
	@GeneratedValue(
			strategy = GenerationType.IDENTITY,
			generator = "answer_sequence"
			)
	private long aId;
	
	@ManyToOne
	@JoinColumn(name="qId")
	Question question;
	@Column
	String answers;
	
	public Answer() {
	}

	public Answer(Question question, String answers) {
		this.question = question;
		this.answers = answers;
	}


	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public String getAnswers() {
		return answers;
	}

	public void setAnswers(String answers) {
		this.answers = answers;
	}
	
}
