package com.feng.observer.basic;

public class Observer1 implements Observer {
    public void notifyMsg(String status) {
        System.out.println("Observer1：接到通知,新状态为：" + status);
    }
}
