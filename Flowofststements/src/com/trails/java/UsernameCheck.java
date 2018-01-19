package com.trails.java;

public class UsernameCheck {



    String username;

    public UsernameCheck(String username) {
        this.username = username;
    }

    public Boolean isValid() {
        return this.username.matches("[a-zA-Z0-9\\.]+@[a-zA-Z0-9\\-\\_\\.]+\\.[a-zA-Z0-9]{3}");
    }
}


