package edu.sjsu.projectcloud;

import java.util.List;

/**
 * Created by mallika on 4/22/15.
 */
public interface IUserHandler {
    public User createUser(String userName, String password);
    public User getUser(String userName);
}
