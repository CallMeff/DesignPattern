package com.feng.builder;


public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Director() {
        builder.createHead();
        builder.createBody();
        builder.createFoot();
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
}
