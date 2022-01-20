package com.example.teammanagement.model;

public class User {
    String id;
    String firstName;
    String lastName;
    String team;
    String role;

    public User(String id, String firstName, String lastName, String team, String role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.team = team;
        this.role = role;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
