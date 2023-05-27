package com.example.demo;

import java.util.ArrayList;

public class MainBean {

    private int countPageRefresh;
    private boolean trigger = false;
    ArrayList<Integer> al;


    public MainBean() {

    }

    public void solve(String args) {

    }

    public int getCountPageRefresh() {
        return countPageRefresh;
    }

    public void setCountPageRefresh(int countPageRefresh) {
        this.countPageRefresh = countPageRefresh;
    }

    public ArrayList<Integer> getAl() {
        return al;
    }

    public void setAl(ArrayList<Integer> al) {
        this.al = al;
    }

    public boolean isTrigger() {
        return trigger;
    }

    public void setTrigger(boolean trigger) {
        this.trigger = trigger;
    }
}
