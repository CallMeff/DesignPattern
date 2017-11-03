package com.feng.singleton;

/**
 * 懒汉单例
 * Created by tianfengluyao on 2017/11/2.
 */
public class LazySingleBean {

    private static LazySingleBean bean = null;

    private LazySingleBean(){};

    public static synchronized LazySingleBean getLazySingleBean(){
        if(bean == null){
            bean = new LazySingleBean();
        }
        return bean;
    }
}
