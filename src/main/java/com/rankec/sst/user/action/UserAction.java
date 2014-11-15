package com.rankec.sst.user.action;

import com.opensymphony.xwork2.ActionSupport;
import com.rankec.sst.user.model.IUser;
import com.rankec.sst.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by rankec on 14.11.14.
 */

@EnableMongoRepositories("com.rankec.sst")
public class UserAction extends ActionSupport {

    IUser user;

    @Autowired
    private UserRepository repository;

    public IUser getUser() {
        return user;
    }

    public void setUser(IUser user) {
        this.user = user;
    }

    public String execute() throws Exception {

        user.printUser();
        repository.save(user);
        return SUCCESS;

    }

}
