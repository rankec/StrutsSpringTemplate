package com.rankec.sst.user.model;

import org.springframework.data.annotation.Id;

/**
 * Created by rankec on 14.11.14.
 */
public class User implements IUser {

    @Id
    private String id;
    private String name;

    public User() {
        name = "test";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printUser() {
        System.out.println("printUser() is executed...");
    }

    @Override
    public String toString() {
        return "UserBoImpl{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
