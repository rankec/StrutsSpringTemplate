package com.rankec.sst.login.action;

import com.opensymphony.xwork2.ActionSupport;
import com.rankec.sst.login.model.Authority;
import com.rankec.sst.login.model.User;
import com.rankec.sst.login.repository.AuthorityRepository;
import com.rankec.sst.login.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by rankec on 16.11.14.
 */

public class RegisterAction extends ActionSupport {

    private String username;
    private String password;

    @Autowired
    private UserRepository repository;

    @Autowired
    private AuthorityRepository authRepository;

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
        if (validInput()) {
            repository.save(new User(username, password));
            authRepository.save(new Authority(username, "ROLE_USER"));
            return SUCCESS;
        }
        return ERROR;
    }

    private boolean validInput() {
        if (username == null || username.isEmpty()) {
            return false;
        }

        if (password == null || password.isEmpty()) {
            return false;
        }

        return !userAlreadyExists();
    }

    private boolean userAlreadyExists() {
        User user = repository.findByName(username);
        if (user == null) {
            return false;
        }

        return true;

    }
}
