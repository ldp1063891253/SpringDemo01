package com.ldp;

import com.ldp.pojo.UserBean;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * 让每一个人的职业生涯不留遗憾
 *
 * @author 波波老师【咕泡学院】
 */
public class IoCMainTest3 {

    /**
     * ApplicationContext
     *    默认在IoC容器初始化的时候就会实例化对象
     */
    @Test
    public void fun1(){
        ApplicationContext ac =
                new ClassPathXmlApplicationContext("applicationContext-static.xml");
        UserBean user = ac.getBean("user", UserBean.class);
        user.say();

    }

    @Test
    public void fun2(){
        ApplicationContext ac =
                new ClassPathXmlApplicationContext("applicationContext-dynamic.xml");
        UserBean user = ac.getBean("user2", UserBean.class);
        user.say();

    }


}
