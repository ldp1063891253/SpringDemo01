package com.ldp;

import com.ldp.pojo.UserBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 让每一个人的职业生涯不留遗憾
 *
 * @author 波波老师【咕泡学院】
 */
public class IoCMainTest {

    /**
     * IoC 控制反转
     * 非IoC的操作
     */
    @Test
    public void fun1(){
        // 非IoC那么我们就直接new出来
        /*UserBean user = new UserBean();
        user.say();*/
    }

    /**
     * IoC的方式获取 UserBean 对象
     * 根据ID从IoC容器中获取对象
     */
    @Test
    public void fun2(){
        // 1.IoC容器的初始化操作 调用UserBean中无参构造器创建对象
        ApplicationContext ac =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2.从容器中获取UserBean对象 没有显示的new
//     UserBean user = (UserBean) ac.getBean("userBean");
        UserBean user = ac.getBean(UserBean.class);
        user.say();
    }

    /**
     * IoC 通过name 从容器中获取对象
     */
    @Test
    public void fun3(){
        ApplicationContext ac =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserBean userBean = (UserBean) ac.getBean("userBean2");
        userBean.say();
    }

    /**
     * IoC 通过name 从容器中获取对象
     */
    @Test
    public void fun4(){
        ApplicationContext ac =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserBean userBean = (UserBean) ac.getBean("user1,user2,user3");
        userBean.say();
    }

    @Test
    public void fun5(){
        ApplicationContext ac =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserBean userBean = (UserBean) ac.getBean("u1");
        userBean.say();
    }

    /**
     *
     */
    @Test
    public void fun6(){
        ApplicationContext ac =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserBean bean = ac.getBean(UserBean.class);
        // UserBean bean = ac.getBean("u1",UserBean.class);
        bean.say();
    }
}
