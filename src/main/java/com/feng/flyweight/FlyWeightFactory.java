package com.feng.flyweight;

import java.util.Hashtable;

/**
 * @desc：享元工厂：按照单例模式设计
 * @author: tfly
 * @date: 2018/4/24 16:44
 */
public class FlyWeightFactory {

    private Hashtable<String,FlyWeight> pool = new Hashtable();

    private FlyWeightFactory flyWeightFactory = new FlyWeightFactory();

    private FlyWeightFactory() {}

    public FlyWeightFactory getFlyWeightFactory(){
        return flyWeightFactory;
    }

    public FlyWeight getFlyWeight(String extrinsic){
        if(pool.containsKey(extrinsic)){
            return pool.get(extrinsic);
        }else{
            return new ConcreteFlyWeight1(extrinsic) ;
        }
    }
}
