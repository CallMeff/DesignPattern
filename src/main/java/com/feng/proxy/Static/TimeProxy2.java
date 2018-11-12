package com.feng.proxy.Static;


import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeProxy2 implements Subject2{

    private RealSubject2 realSubject2;
    private SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    public TimeProxy2(RealSubject2 realSubject) {
        this.realSubject2 = realSubject2;
    }

    public void move() throws InterruptedException {
        this.start();
        realSubject2.move();
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
