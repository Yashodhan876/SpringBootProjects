package com.example.SpringBootLearning.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="Title")
    private String title;
    @ManyToMany
    @Column(name = "Questions")
    private List<Maths_Questions> maths_questions;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Maths_Questions> getMaths_questions() {
        return maths_questions;
    }

    public void setMaths_questions(List<Maths_Questions> maths_questions) {
        this.maths_questions = maths_questions;
    }
}
