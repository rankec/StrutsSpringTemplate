package com.rankec.sst.login.action;

import com.opensymphony.xwork2.ActionSupport;
import com.rankec.sst.login.model.User;
import com.rankec.sst.login.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by rankec on 16.11.14.
 */
public class LoginAction extends ActionSupport {

    private String username;
    private String password;

    @Autowired
    private UserRepository repository;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String execute() throws Exception {
        User user = repository.findByName(username);

        if (user != null && user.getPassword().equals(password)) {
            return LOGIN;

        }
        return ERROR;
    }
}
