package com.example.whatsapp.Model;

import java.io.Serializable;

public class ChatsModel implements Serializable {

    private String name;
    private int userImg;

    public ChatsModel(String name, int userImg) {
        this.name = name;
        this.userImg = userImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserImg() {
        return userImg;
    }

    public void setUserImg(int userImg) {
        this.userImg = userImg;
    }
}