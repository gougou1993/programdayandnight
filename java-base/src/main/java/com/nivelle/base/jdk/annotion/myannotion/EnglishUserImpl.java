package com.nivelle.base.jdk.annotion.myannotion;

public class EnglishUserImpl implements IUser {
    @Override
    public void login() {
        System.err.println("User Login！");
    }
}

