package com.feng.proxy.Static;


public class RealSubject implements Subject,Subject2 {

    public void run(){
        System.out.println("i can run");
    }

    public void move() throws InterruptedException {
        System.out.println("i can move");
    }
}
