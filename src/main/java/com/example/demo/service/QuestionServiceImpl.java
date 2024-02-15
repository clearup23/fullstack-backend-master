package com.example.demo.service;

import com.example.demo.model.Question;
import com.example.demo.repository.QuestionRepository;
import com.example.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public List<Question> getRecentQuestions() {
        return questionRepository.findAll();
    }

    @Override
    public Question saveQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public Optional<Question> getQuestionById(Long questionId) {
         return questionRepository.findById(questionId);
    }
    @Override
    public void deleteQuestion(Long questionId) {
        questionRepository.deleteById(questionId);
    }


}
