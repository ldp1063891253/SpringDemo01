package com.ldp.factory;

import com.ldp.pojo.UserBean;

import java.util.HashMap;
import java.util.Map;


public class StaticFactoryDemo {

    public static Map<String, UserBean> hashMap ;

    static {
        hashMap = new HashMap<String, UserBean>();
        hashMap.put("a1",new UserBean());
        hashMap.put("a2",new UserBean());
        hashMap.put("a3",new UserBean());
    }

    /**
     * 静态工厂提供的方法
     * @return
     */
    public static UserBean getInstance(){
        return hashMap.get("a1");
    }
}
