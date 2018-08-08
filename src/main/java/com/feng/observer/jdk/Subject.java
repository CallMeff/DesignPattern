package com.feng.observer.jdk;



import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Subject extends Observable {

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
            observer.update(this,status);
        }
    }
}
