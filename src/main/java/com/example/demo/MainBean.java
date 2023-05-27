package com.example.demo;

import java.util.ArrayList;

public class MainBean {
    private int countPageRefresh;
    private boolean trigger = false;
    ArrayList<Integer> al;

    public String getArgs() {
        return args;
    }

    public void setArgs(String args) {
        this.args = args;
    }

    private String args;

    public MainBean(String args) {
        this.args = args;
    }

    public MainBean() {

    }

    public String solve(String argsm) {
        String[] args = argsm.split(" ");
        int[] arr = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        int value = 5, res = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > value) {
                res *= arr[i];
            }
        }
        return String.valueOf(res);
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
