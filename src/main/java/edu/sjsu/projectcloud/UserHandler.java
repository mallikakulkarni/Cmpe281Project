package edu.sjsu.projectcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by mallika on 4/22/15.
 */
@Component
public class UserHandler implements IUserHandler {


    @Override
    public User createUser(String userName, String password) {

    }

    @Override
    public User getUser(String userName) {
        return null;
    }
}
