package com.example.demo.model;

import com.example.demo.model.Question;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date")
    private Date createdDate;

    @ManyToOne
    @JoinColumn(name = "question_id", referencedColumnName = "id")
    private Question question;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id") // This column will be the foreign key
    private User user;


    @Override
    public String toString() {
        return "Reply{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", createdDate=" + createdDate +
                ", question=" + question +
                ", user=" + user +
                '}';
    }

    public Long getId() {
        return id;
    }

    public Reply() {
        // Default constructor is needed by JPA
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Reply(Long id, String content, Date createdDate, Question question, User user) {
        this.id = id;
        this.content = content;
        this.createdDate = createdDate;
        this.question = question;
        this.user = user;
    }
// Other fields, getters, and setters
}
