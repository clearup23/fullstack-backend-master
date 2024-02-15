package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {
    User getByUserEmail(String email);
    void saveorUpdateUser(User user);
}
