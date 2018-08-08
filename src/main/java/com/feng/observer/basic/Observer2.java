package com.feng.observer.basic;

public class Observer2 implements Observer{
    public void notifyMsg(String status) {
        System.out.println("Observer2：接到通知,新状态为：" + status);
    }
}
