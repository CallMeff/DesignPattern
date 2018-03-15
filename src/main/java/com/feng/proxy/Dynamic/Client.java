package com.feng.proxy.Dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) throws InterruptedException {
//        Subject timeProxy = new TimeProxy(new RealSubject());
//        RealSubject realSubject = new RealSubject();
//        InvocationHandler timeInvokerHandler = new TimeInvokerHandler(realSubject);
//        Subject timeProxy = (Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),realSubject.getClass().getInterfaces(),timeInvokerHandler);
//        timeProxy.run();
//
//        InvocationHandler timeInvokerHandler2 = new TimeInvokerHandler2(realSubject);
//        Subject2 timeProxy2 = (Subject2) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),realSubject.getClass().getInterfaces(),timeInvokerHandler2);
//
//        timeProxy2.move();

        /* 当另一个类也需要代理*/
        RealSubject2 realSubject2 = new RealSubject2();
        InvocationHandler timeInvokerHandler = new TimeInvokerHandler(realSubject2);
        Subject timeProxy = (Subject) Proxy.newProxyInstance(realSubject2.getClass().getClassLoader(),realSubject2.getClass().getInterfaces(),timeInvokerHandler);
        timeProxy.run();

        InvocationHandler timeInvokerHandler2 = new TimeInvokerHandler2(realSubject2);
        Subject2 timeProxy2 = (Subject2) Proxy.newProxyInstance(realSubject2.getClass().getClassLoader(),realSubject2.getClass().getInterfaces(),timeInvokerHandler2);

        timeProxy2.move();


    }
}
