package com.feng.observer.jdk;

import java.util.Observable;

public class Observer implements java.util.Observer {

    private String name;

    public Observer(String name) {
        this.name = name;
    }

    public void update(Observable o, Object arg) {
        System.out.println(name + "收到通知，新状态为：" + ((Subject)o).getStatus());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
