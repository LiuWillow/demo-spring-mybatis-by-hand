package com.mybatis.source;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * date  2019/1/20
 * author liuwillow
 **/
public class MyInvocationHandler implements InvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String sql = method.getAnnotation(Select.class).value();
        System.out.println("模拟执行sql：" + sql);
        return null;
    }
}
