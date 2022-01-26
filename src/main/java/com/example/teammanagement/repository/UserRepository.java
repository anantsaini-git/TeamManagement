package com.example.teammanagement.repository;

import com.example.teammanagement.exception.InvalidUserException;
import com.example.teammanagement.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    static List<User> usersList;

    static {
        usersList = new ArrayList<>();
        User user1 = new User("ID1", "user_fname1", "user_lname1", "Team 1", "Admin");
        User user2 = new User("ID2", "user_fname2", "user_lname2", "Team 1", "Admin");
        User user3 = new User("ID3", "user_fname3", "user_lname3", "Team 1", "Admin");
        User user4 = new User("ID4", "user_fname4", "user_lname4", "Team 1", "Teammate");

        usersList.add(user1);
        usersList.add(user2);
        usersList.add(user3);
        usersList.add(user4);
    }

    public static User getUser(String id) {
        for(User user: usersList) {
            if(user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    public static List<User> getAllUsers() {
        return usersList;
    }

    public static void createUser(User newUser) throws InvalidUserException {
        if(newUser == null || newUser.getId() == null ||"".equals(newUser.getId())) {
             throw new InvalidUserException("User ID cannot be blank or null");
        }
        usersList.add(newUser);
    }

    public static void deleteUser(User user) throws InvalidUserException {
        if(user == null || user.getId() == null ||"".equals(user.getId())) {
            throw new InvalidUserException("User ID cannot be blank or null");
        }

        int index = usersList.indexOf(user);
        if(index != -1) {
            usersList.remove(index);
        }
    }
}
