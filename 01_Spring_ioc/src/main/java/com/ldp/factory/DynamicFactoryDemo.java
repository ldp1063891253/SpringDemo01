package com.ldp.factory;


import com.ldp.pojo.UserBean;

/**
 * 让每一个人的职业生涯不留遗憾
 *
 * @author 波波老师【咕泡学院】
 */
public class DynamicFactoryDemo {


    public UserBean getInstance(){
        return new UserBean();
    }
}
