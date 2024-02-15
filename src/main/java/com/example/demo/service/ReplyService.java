package com.example.demo.service;

import com.example.demo.model.Question;
import com.example.demo.model.Reply;

import java.util.List;

public interface ReplyService {
    List<Reply> getRepliesByQuestion(Question question);

    List<Reply> getRepliesByQuestion(Long questionId);

    Reply saveReply(Reply reply);

    List<Reply> getAllReplies();

    boolean deleteReply(Long replyId);
}