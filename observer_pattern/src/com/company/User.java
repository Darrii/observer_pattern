package com.company;

import java.util.List;

public class User implements IObserver{
    private String name;

    public User(String name){ this.name = name; }

    @Override
    public void update(List<News> news) {
        System.out.println("Dear " + this.name + "\nYou have new message: \n" + news + "\n");
    }
}
