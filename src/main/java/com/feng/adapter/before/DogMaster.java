package com.feng.adapter.before;

/**
 * @desc：
 * @title：DogMaster
 * @author: tianfengluyao
 * @date: 2018/11/12 11:39
 */
public class DogMaster {

    private Dog dog;

    /**
     * @desc 狗主人有一只狗
     * @param dog
     */
    public DogMaster(Dog dog) {
        this.dog = dog;
    }

    /**
     * @desc 让狗叫
     * @return 狗叫声
     */
    public String LetDogBark(){
        return dog.bark();
    }
}
