package com.feng.builder;

public class Client {

    public static void main(String[] args) {
        Director director = new Director(new ComtractBuilder());
        Humen humen = (Humen) director.getBuilder();
    }
}
