package com.mybatis.source;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * date  2019/1/20
 * author liuwillow
 * 重点在于@Import注解的类，启动时会扫描该注解，执行类中的registerBeanDefinitions方法
 **/
@Import(MyMapperRegistrar.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface EnableSelfMapper {
}
