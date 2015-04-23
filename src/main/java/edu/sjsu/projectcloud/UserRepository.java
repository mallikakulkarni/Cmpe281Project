package edu.sjsu.projectcloud;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by mallika on 4/22/15.
 */
@Component
public interface UserRepository extends MongoRepository<User, String> {
    public User findByUserName(String userName);
}
