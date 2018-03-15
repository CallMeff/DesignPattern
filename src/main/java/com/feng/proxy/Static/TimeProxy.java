package com.feng.proxy.Static;


import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeProxy implements Subject{

    private RealSubject realSubject;
    private SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    public TimeProxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    public void run() throws InterruptedException {
        this.start();
        realSubject.run();
        Thread.sleep(1000);
        this.end();
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
