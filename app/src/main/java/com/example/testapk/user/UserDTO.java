package com.example.testapk.user;

public class UserDTO {

    private String username, password, email, role;
    private int id;

    public UserDTO() {}
    public UserDTO(int id, String username, String password, String email)
    {
        this.username = username;
        this.id = id;
        this.password = password;
        this.email = email;
        role = "USER";
    }

    public UserDTO(int id, String username, String password, String email, String role)
    {
        this.username = username;
        this.id = id;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    public UserDTO(String username, String password, String email)
    {
        this.username = username;
        this.password = password;
        this.email = email;
        role = "USER";
    }

    public String getUsername() {
        return this.username;
    }

    public int getId() {
        return this.id;
    }

    public String getPassword() {
        return this.password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String description) {
        this.password = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
