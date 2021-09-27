package com.company;

public class Main {

    public static void main(String[] args) {
        NewsChannel celebrity = new NewsChannel();
        NewsChannel kpop = new NewsChannel();


        User user1 = new User("Bob");
        User user2 = new User("Alice");
        User user3 = new User("Mary");

        celebrity.registerUser(user1);
        kpop.registerUser(user2);
        celebrity.registerUser(user3);

        celebrity.addNews(new News("Ariana", "Ariana married her new boyfriend"));
        kpop.addNews(new News("BTS", "BTS released their new album"));

        celebrity.unregisterUser(user1);

        celebrity.addNews(new News("Dua Lipa", "Dua Lipa also married"));

    }
}
