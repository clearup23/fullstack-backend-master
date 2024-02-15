package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    public Question() {
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", user=" + user +
                ", createdDate=" + createdDate +
                '}';
    }

    public Question(Long id, String content, User user, Date createdDate) {
        this.id = id;
        this.content = content;
        this.user = user;
        this.createdDate = createdDate;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id") // This column will be the foreign key
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date")
    private Date createdDate;





    public Long getId() {
        return id;
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


}
