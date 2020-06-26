package com.example.captorche.model;

import java.util.ArrayList;

public class Users {
    private ArrayList<User> list;

    public Users(){
        this.list = new ArrayList<User>();
}

    public void addUser(String name){

        int nb = this.list.size();
        this.list.add(new User(name, nb+1));
    }

}