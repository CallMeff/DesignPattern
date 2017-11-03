package com.feng.singleton;

/**
 * 线程安全的懒汉(双重检查锁定(Double-Check Locking))
 * Created by tianfengluyao on 2017/11/2.
 */
public class LazyDLSingleBean {

    private static LazyDLSingleBean bean;

    private LazyDLSingleBean() {
    }

    public static LazyDLSingleBean getLazySingleBean() {
        if (bean == null) {
            synchronized (LazyDLSingleBean.class) {
                if (bean == null) {
                    bean = new LazyDLSingleBean();
                }
            }
        }
        return bean;
    }
}
