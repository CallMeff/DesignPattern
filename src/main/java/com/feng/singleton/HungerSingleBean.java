package com.feng.singleton;

/**
 * 饿汉单例
 * Created by tianfengluyao on 2017/11/2.
 */
public class HungerSingleBean {

    private static final HungerSingleBean bean = new HungerSingleBean();

    private HungerSingleBean(){};

    public static HungerSingleBean getHungerSingleBean(){
        return bean;
    }
}
