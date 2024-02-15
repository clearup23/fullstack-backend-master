package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getByUserEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void saveorUpdateUser (User user){
        userRepository.save(user);
    }
}
