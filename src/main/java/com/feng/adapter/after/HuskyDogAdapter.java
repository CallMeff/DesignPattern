package com.feng.adapter.after;

import com.feng.adapter.before.Dog;
import com.feng.adapter.before.HuskyDog;

/**
 * @desc：Husky适配器:让Husky像狗一样叫
 * @title：DogMaster
 * @author: tianfengluyao
 * @date: 2018/11/12 10:56
 */
public class HuskyDogAdapter implements Dog {

    private HuskyDog huskyDog;

    public HuskyDogAdapter() {
        this.huskyDog = new HuskyDog();
    }

    public String bark() {
        return huskyDog.talk();
    }
}
