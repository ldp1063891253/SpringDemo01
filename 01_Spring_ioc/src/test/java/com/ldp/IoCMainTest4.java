package com.ldp;


import com.ldp.pojo.UserBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;
import java.util.Set;

/**
 * 让每一个人的职业生涯不留遗憾
 *
 * @author 波波老师【咕泡学院】
 */
public class IoCMainTest4 {

    @Test
    public void fun1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-01.xml");
        UserBean user = ac.getBean("user", UserBean.class);
        System.out.println(user);
    }

    @Test
    public void fun2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-01.xml");
        UserBean user = ac.getBean("user1", UserBean.class);
        System.out.println(user);
    }

    @Test
    public void fun3(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-02.xml");
        UserBean user = ac.getBean("user", UserBean.class);
        System.out.println(user.getCat());
        String[] favorites = user.getFavorites();
        for (String f:favorites){
            System.out.println(f);
        }
        System.out.println(user.getCats());
        Set<String> maps = user.getMap().keySet();
        for (String key:maps){
            System.out.println(key + ":" + user.getMap().get(key));

        }
        Properties props = user.getProps();
        System.out.println(props.getProperty("username"));
        System.out.println(props.getProperty("password"));
    }
}
