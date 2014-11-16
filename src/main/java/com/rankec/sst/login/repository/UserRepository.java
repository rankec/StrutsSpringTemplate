package com.rankec.sst.login.repository;

import com.rankec.sst.login.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by rankec on 14.11.14.
 */

public interface UserRepository extends MongoRepository<User, String> {

    User findByName(String name);

}
