package com.example.demo.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Integer userid){
        super("User not found");
    }
}
