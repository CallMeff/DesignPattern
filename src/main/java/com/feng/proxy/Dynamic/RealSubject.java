package com.feng.proxy.Dynamic;


public class RealSubject implements Subject,Subject2 {

    public void move(){
        System.out.println("i can move");
    }

    public void run(){
        System.out.println("i can run");
    }
}
