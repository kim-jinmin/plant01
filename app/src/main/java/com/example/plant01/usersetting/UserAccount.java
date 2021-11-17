package com.example.plant01.usersetting;

public class UserAccount {
    private String idToken;
    private String emailId;
    private String password;

    public UserAccount(){ }

    public String getIdToken() {
        return idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String name) {
        this.emailId = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
