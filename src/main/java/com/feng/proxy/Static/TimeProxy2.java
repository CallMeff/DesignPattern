package com.feng.proxy.Static;


import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeProxy2 implements Subject2{

    private RealSubject realSubject;
    private SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    public TimeProxy2(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    public void move() throws InterruptedException {
        this.start();
        realSubject.move();
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
