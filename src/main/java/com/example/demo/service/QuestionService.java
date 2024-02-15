package com.example.demo.service;

import com.example.demo.model.Question;

import java.util.List;
import java.util.Optional;

public interface QuestionService {
    List<Question> getRecentQuestions();
    Question saveQuestion(Question question);

    Optional<Question> getQuestionById(Long questionId);
    void deleteQuestion(Long questionId);
}
