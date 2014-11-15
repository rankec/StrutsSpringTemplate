package com.rankec.sst.user.repository;

import com.rankec.sst.user.model.IUser;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by rankec on 14.11.14.
 */


public interface UserRepository extends MongoRepository<IUser, String> {

}
