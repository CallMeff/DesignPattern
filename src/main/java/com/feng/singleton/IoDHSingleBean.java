package com.feng.singleton;

/**
 * 静态内部类方式实现单例
 * 静态内部类只会在使用的时候被加载，用它来实现单例是最好的方式之一
 * Created by tianfengluyao on 2017/11/2.
 */
public class IoDHSingleBean {

    private IoDHSingleBean(){};

    private static class HolderClass{
        private static final IoDHSingleBean bean = new IoDHSingleBean();
    }

    public static IoDHSingleBean getIoDHSingleBean(){
        return HolderClass.bean;
    }
}
