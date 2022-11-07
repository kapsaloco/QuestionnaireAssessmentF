package com.QA.QuestionnaireAssessment.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table
@AllArgsConstructor

public class Question {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column
    private long qId;

    @Column
    private String question;

    @JsonIgnore
    @OneToMany(mappedBy = "question", fetch = FetchType.EAGER)
    private List<Answer> answers;
    
    public Question() {
    	
    }

	public Question(String question) {
		this.question = question;
	}

	public Question(String question, List<Answer> answers) {
        super();
		this.question = question;
		this.answers = answers;
    }
    
    public long getqId() {
		return qId;
	}

	public void setqId(long qId) {
		this.qId = qId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

    @Override
    public String toString() {
        return "Question{" +
                "qId=" + qId +
                ", question='" + question + '\'' +
                ", answers=" + answers +
                '}';
    }
}
