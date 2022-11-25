package com.atguigu.spring5;

import com.atguigu.config.SpringConfig;
import com.atguigu.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author superherozhang
 * @create 2022-09-30 9:32
 */
public class junitTest {
    @Test
    public void testUserService(){
        ApplicationContext context=new ClassPathXmlApplicationContext("userService.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
        System.out.println(userService);
    }

    @Test
    public void testUserService1(){
        //1.加载配置类
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
        System.out.println(userService);
    }
}
