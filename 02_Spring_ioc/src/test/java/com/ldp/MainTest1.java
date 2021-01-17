package com.ldp;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainTest1 {
    @Test
    public void fun1(){
        // 通过@Configuraction注解来初始化IoC容器
        ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
        System.out.println("----");
        System.out.println(ac.getBean("aaa",User.class));
        User person = ac.getBean(User.class);
        System.out.println(person);
    }
}
