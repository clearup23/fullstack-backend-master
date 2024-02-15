package com.example.demo.service;

import com.example.demo.model.Question;
import com.example.demo.model.Reply;
import com.example.demo.repository.QuestionRepository;
import com.example.demo.repository.ReplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReplyServiceImpl implements ReplyService {

    @Autowired
    private ReplyRepository replyRepository;

    @Autowired
    private QuestionRepository questionRepository;


    @Override
    public List<Reply> getAllReplies() {
        return replyRepository.findAll();
    }
    @Override
    public List<Reply> getRepliesByQuestion(Question question) {
        return null;
    }

    @Override
    public List<Reply> getRepliesByQuestion(Long questionId) {
        return replyRepository.findByQuestionIdOrderByCreatedDate(questionId);
    }

    @Override
    public Reply saveReply(Reply reply) {
        // You might want to set the createdDate before saving the reply
        reply.setCreatedDate(new Date());

        // Your logic to save the reply
        return replyRepository.save(reply);
    }
    @Override
    public boolean deleteReply(Long replyId) {
        if (replyRepository.existsById(replyId)) {
            replyRepository.deleteById(replyId);
            return true;
        }
        return false;
    }
}

