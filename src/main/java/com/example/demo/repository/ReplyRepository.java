package com.example.demo.repository;

import com.example.demo.model.Reply;
import com.example.demo.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
    List<Reply> findByQuestionOrderByCreatedDate(Question question);
    List<Reply> findByQuestionIdOrderByCreatedDate(Long questionId);
    List<Reply> findAll();


}
