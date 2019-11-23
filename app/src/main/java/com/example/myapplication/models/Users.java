package com.example.myapplication.models;


import java.util.ArrayList;
import java.util.List;

public class Users {
    public String Username;
    public String password;

    public static Boolean passwordIsValid(String User,
                                          String Password) {
        for (Users i:getUsers()) {
            if (i.Username.equals(User)){
                if (i.password.equals(Password)){
                    return true;
                }
            }
        }
        return false;
    }

    public static List<Users> getUsers(){
        List<Users> list = new ArrayList<Users>();
        Users o = new Users();
        o.Username = "bichito";
        o.password = "123456";
        list.add(o);
        Users t = new Users();
        t.Username = "juanita";
        t.password = "123456";
        list.add(t);
        return  list;

    }
}
