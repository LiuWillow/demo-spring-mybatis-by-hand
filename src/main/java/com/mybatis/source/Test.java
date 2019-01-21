package com.mybatis.source;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * date  2019/1/19
 * author liuwillow
 **/

public class Test {
    public static void main(String[] args)  {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = (UserService) annotationConfigApplicationContext.getBean("userService");
        UserService2 userService2 = (UserService2) annotationConfigApplicationContext.getBean("userService");
        userService.query();
        userService2.query();
    }
}
