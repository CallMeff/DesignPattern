package com.feng.proxy.Static;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        Subject timeProxy = new TimeProxy(new RealSubject());

        timeProxy.run();

        Subject2 timeProxy2 = new TimeProxy2(new RealSubject());

        timeProxy2.move();
    }
}
