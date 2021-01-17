package com.ldp;


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
public class IoCMainTest2 {

    /**
     * ApplicationContext
     *    默认在IoC容器初始化的时候就会实例化对象
     */
    @Test
    public void fun1(){
        ApplicationContext ac =
                new ClassPathXmlApplicationContext("applicationContext.xml");

    }

    /**
     * BeanFactory
     *    IoC容器初始化的时候不会实例化对象
     *    在调用获取的时候才会创建对象
     */
    @Test
    public void fun2(){
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        factory.getBean("u1");
    }
}
