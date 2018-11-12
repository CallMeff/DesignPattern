package com.feng.adapter.before;

/**
 * @desc：客户端
 * @title：Client
 * @author: tianfengluyao
 * @date: 2018/11/12 11:03
 */
public class Client {

    public static void main(String[] args) {
        //狗主人让狗叫
        DogMaster dogMaster = new DogMaster(new PugDog());
        System.out.println(dogMaster.LetDogBark());

        /**
         * 问题：如何让HuskyDog叫呢？
         * 分析： 1、狗主人只能让实现了Dog接口的狗bark
         *       2、 HuskyDog没有实现Dog接口，而且只有一个talk方法
         *       3、 根据开闭原则，不去更改HuskyDog类，而是新增一个HuskyDogAdapter类来适配HuskyDog
         */

    }
}
