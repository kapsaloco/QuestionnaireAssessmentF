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
@Getter
@Setter
@NoArgsConstructor
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

    public Question(String question) {
        this.question = question;
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
