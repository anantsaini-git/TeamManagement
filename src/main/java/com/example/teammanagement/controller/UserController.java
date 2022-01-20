package com.example.teammanagement.controller;

import com.example.teammanagement.model.User;
import com.example.teammanagement.repository.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @RequestMapping(method = RequestMethod.GET, path = "/getUser", params = "userID")
    public User getUser(String userID) {
        return UserRepository.getUser(userID);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/getAllUsers")
    public List<User> getAllUsers() {
        return UserRepository.getAllUsers();
    }
}
