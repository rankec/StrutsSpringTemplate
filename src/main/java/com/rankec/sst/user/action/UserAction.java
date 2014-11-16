package com.rankec.sst.user.action;

import com.opensymphony.xwork2.ActionSupport;
import com.rankec.sst.login.repository.UserRepository;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by rankec on 14.11.14.
 */

public class UserAction extends ActionSupport {

    private String username;
    private String message;

    @Autowired
    private UserRepository repository;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String execute() throws Exception {

        HttpServletRequest request = ServletActionContext.getRequest();
        this.setUsername(request.getUserPrincipal().getName());
        this.setMessage("Successful Struts spring secuirty authentication");


        return SUCCESS;

    }

}
