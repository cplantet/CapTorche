package com.example.captorche.model;

public class Users {
    private ArrayList<User> list;

    public Users(){
        this.list = new ArrayList<User>();
    }

    public void AddUser(int String){
        int nb = this.list.size();
        this.list.add(new User(String, nb+1));
    }

}