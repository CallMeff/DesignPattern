package com.feng.proxy.Dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeInvokerHandler2 implements InvocationHandler{

    private Object object;
    private SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    public TimeInvokerHandler2(Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.start();
        method.invoke(object,args);
        Thread.sleep(1000);
        this.end();
        return proxy;
    }

    public void start(){
        Date startDate = new Date();
        System.out.println("start time:"+dataFormat.format(startDate));
    }

    public void end(){
        Date endDate = new Date();
        System.out.println("end time:"+dataFormat.format(endDate));
    }
}
