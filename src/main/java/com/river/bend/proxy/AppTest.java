package com.river.bend.proxy;

public class AppTest {

    public static void main(String[] args){
        UserDao target = new UserDao();

        UserDaoProxy userDaoProxy = new UserDaoProxy(target);

        userDaoProxy.save();
    }
}
