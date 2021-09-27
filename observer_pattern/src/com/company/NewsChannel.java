package com.company;

import java.util.ArrayList;
import java.util.List;

public class NewsChannel implements IObservable{
    private List<News> news = new ArrayList<>();
    private List<IObserver> users = new ArrayList<>();

    public List<IObserver> getUsers() { return users; }
    public void setUsers(List<IObserver> users) { this.users = users; }

    public void addNews(News news){
        this.news.add(news);
        notifyAllUsers();
    }

    public void removeNews(String news){
        this.news.remove(news);
        notifyAllUsers();
    }

    @Override
    public void registerUser(IObserver user) {
        this.users.add(user);
    }

    @Override
    public void unregisterUser(IObserver user) {
        this.users.remove(user);
    }

    @Override
    public void notifyAllUsers() {
        for (IObserver observer : this.users){
            observer.update(news);
        }
    }
}
