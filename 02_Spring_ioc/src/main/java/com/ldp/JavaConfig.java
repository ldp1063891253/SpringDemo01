package com.ldp;


import org.springframework.context.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 让每一个人的职业生涯不留遗憾
 *      Java配置类 相当于applicationContext.xml
 * @author 波波老师【咕泡学院】
 */
@Configuration
public class JavaConfig {

    /**
     * @Bean 作用和我们在applicationContext.xml中添加的<bean> 效果一样</>
     * 默认的name是方法名称
     * 自定义的name 可以通过value属性或者name属性来指定
     * @return
     */
    @Bean(name = {"aaa","bbb"})
    public User getUser(){
        User user = new User();
        //user.set....
        return user;
    }
}
