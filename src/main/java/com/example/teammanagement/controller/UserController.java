package com.example.teammanagement.controller;

import com.example.teammanagement.exception.InvalidUserException;
import com.example.teammanagement.model.User;
import com.example.teammanagement.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
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

    @RequestMapping(method = RequestMethod.POST, path = "/createUser")
    public ResponseEntity createUser(@RequestBody User newUser) {
        try {
            UserRepository.createUser(newUser);
            return new ResponseEntity(HttpStatus.CREATED);
        } catch (InvalidUserException e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/deleteUser")
    public ResponseEntity deleteUser(@RequestBody User user) {
        try {
            UserRepository.deleteUser(user);
            return new ResponseEntity(HttpStatus.ACCEPTED);
        } catch (InvalidUserException e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }
}
