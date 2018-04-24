package com.feng.flyweight;

/**
 * @desc：抽象享元对象：
 * 通常是一个接口或抽象类，在抽象享元类中声明了具体享元类公共的方法，
 * 这些方法可以向外界提供享元对象的内部数据（内部状态），
 * 同时也可以通过这些方法来设置外部数据（外部状态）。
 * @author: tfly
 * @date: 2018/4/24 16:21
 */
public abstract class FlyWeight{

    //内部状态
    private String intrinsic;

    //外部状态:必须是final
    private final String objectKey;

    //要求享元角色必须接受外部状态
    public FlyWeight(String objectKey) {
        this.objectKey = objectKey;
    }

    //定义业务操作
    public abstract void operate();

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
