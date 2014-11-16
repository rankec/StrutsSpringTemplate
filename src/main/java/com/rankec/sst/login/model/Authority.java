package com.rankec.sst.login.model;

import org.springframework.data.annotation.Id;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rankec on 16.11.14.
 */
public class Authority {

    @Id
    private String id;

    private String username;
    private List<String> authGroups;

    public Authority() {
    }

    public Authority(String username, String... roles) {
        this.username = username;
        authGroups = Arrays.asList(roles);
    }

    public Authority(String username, List<String> authGroups) {
        this.authGroups = authGroups;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getAuthGroups() {
        return authGroups;
    }

    public void setAuthGroups(List<String> authGroups) {
        this.authGroups = authGroups;
    }

    public void addAuthGroup(String authGroup) {
        authGroups.add(authGroup);
    }

    public String[] getAuthArray() {
        return authGroups.toArray(new String[authGroups.size()]);
    }
}
