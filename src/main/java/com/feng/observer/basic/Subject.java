package com.feng.observer.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题类：观察者们订阅的主题
 * 1、它具有一个状态，当状态变更时通知所有观察者
 * 2、它维护一个订阅者列表
 * 3、它提供新增删除订阅者的方法
 */
public class Subject {

    private String status;

    private List<Observer> observerList;

    public Subject() {
    }

    public void addObserver(Observer observer){
        if(observerList == null){
            observerList = new ArrayList<Observer>();
        }
        observerList.add(observer);
    }

    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }

    public String getStatus() {
        return status;
    }

    /**
     * @desc  状态变更方法，方法中通知所有观察者
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
        //通知所有观察者
        notify(observerList);
    }

    private void notify(List<Observer> observerList) {
        for (Observer observer:observerList) {
            observer.notifyMsg(status);
        }
    }
}
