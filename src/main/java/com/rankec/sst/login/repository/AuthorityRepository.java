package com.rankec.sst.login.repository;

import com.rankec.sst.login.model.Authority;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by rankec on 16.11.14.
 */

public interface AuthorityRepository extends MongoRepository<Authority, String> {

    Authority findByUsername(String username);
}
