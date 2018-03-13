package com.feng.builder;

public class Humen {

    private String head;
    private String body;
    private String foot;

    public Humen() {
        this.head = getHead();
        this.body = getBody();
        this.foot = getFoot();
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }
}
