package com.mybatis.source;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

import java.lang.reflect.Proxy;

/**
 * date  2019/1/19
 * author liuwillow
 * 所有的mapper都通过这个bean来处理并返回实例
 **/
//@Component
public class MyMapperFactoryBean implements FactoryBean {
    private Class classInterface;
    public MyMapperFactoryBean(Class classInterface){
        this.classInterface = classInterface;
    }
    @Nullable
    public Object getObject() throws Exception {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{classInterface}, new MyInvocationHandler());
    }

    @Nullable
    public Class<?> getObjectType() {
        return classInterface;
    }
}
