package com.rankec.sst.admin.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by rankec on 16.11.14.
 */
public class AdminAction extends ActionSupport {

    private String username;
    private String password;

    @Override
    public String execute() {

        return SUCCESS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
