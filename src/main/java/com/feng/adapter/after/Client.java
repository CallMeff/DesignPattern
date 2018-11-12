package com.feng.adapter.after;

import com.feng.adapter.before.DogMaster;

/**
 * @desc：客户端
 * @title：App
 * @author: tianfengluyao
 * @date: 2018/11/12 10:50
 */
public class Client {

    public static void main(String[] args) {
        //狗主人让Husky叫
        DogMaster dogMaster = new DogMaster(new HuskyDogAdapter());
        System.out.println(dogMaster.LetDogBark());
    }


}
