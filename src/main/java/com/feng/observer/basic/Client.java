package com.feng.observer.basic;

public class Client {

    public static void main(String[] args) {
        //创建一个主题对象
        Subject mySubject = new Subject();
        //向主题中添加观察者对象
        mySubject.addObserver(new Observer1());
        mySubject.addObserver(new Observer2());
        //主题状态发生改变，由于改变状态方法中有通知观察者的动作，所以改变状态后，所有观察者收到通知
        mySubject.setStatus("2");
    }
}
