package edu.sjsu.projectcloud;

import org.springframework.data.annotation.Id;

/**
 * Created by mallika on 4/22/15.
 */
public class User {
    @Id
    private String id;

    private static long count = 10000;
    private String userName;
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User(String userName, String password) {
        this.id = assignId();
        this.userName = userName;
        this.password = password;
    }

    private String assignId() {
        count++;
        return ""+count;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
