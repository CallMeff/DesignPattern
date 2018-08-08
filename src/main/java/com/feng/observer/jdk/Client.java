package com.feng.observer.jdk;

public class Client {

    public static void main(String[] args) {
        //创建一个主题对象
        Subject subject = new Subject();
        //向主题对象中添加观察者
        subject.addObserver(new Observer("观察者A"));
        subject.addObserver(new Observer("观察者B"));
        //主题对象状态变更
        subject.setStatus("2");
    }
}
