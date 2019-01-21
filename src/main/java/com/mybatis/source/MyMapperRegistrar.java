package com.mybatis.source;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * date  2019/1/20
 * author liuwillow
 * 这个部分，
 **/
public class MyMapperRegistrar implements ImportBeanDefinitionRegistrar {
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata,
                                        BeanDefinitionRegistry beanDefinitionRegistry) {
        /**
         * mybatis里会通过mapperScan中的包名扫描mapper接口，获取这个类数组
         */
        Class[] classes = new Class[]{UserDao1.class, UserDao2.class};
        /**
         * 遍历类数组，把class转换成beanDefinition注册到IOC容器中
         */
        for (Class clazz : classes) {
            BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(classes[0]);
            GenericBeanDefinition beanDefinition = (GenericBeanDefinition) builder.getBeanDefinition();
            beanDefinition.setBeanClass(MyMapperFactoryBean.class);
            //获取构造器并注入类，这里会自动将类名转换成class
            beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(clazz.getName());
            //Spring只认识factoryBean和beanDefinition
            //beanDefinition拥有class的所有信息，Spring可以并且只能根据beanDefinition做几乎对类的所有操作包括实例化
            //autowired就可以扫描到容器中的内容并取出使用
            beanDefinitionRegistry.registerBeanDefinition(clazz.getSimpleName(), beanDefinition);
        }
    }
}
