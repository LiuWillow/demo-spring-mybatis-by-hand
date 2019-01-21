package com.mybatis.other;

import com.mybatis.source.UserService2;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * date  2019/1/20
 * author liuwillow
 * 后置处理器，在factory生成后，bean实例化之前，必须加@Component注解
 **/
//@Component
public class TestFactoryPostProcessor implements BeanFactoryPostProcessor {
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        GenericBeanDefinition genericBeanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition("luBanFactoryBean");
        genericBeanDefinition.setBeanClass(UserService2.class);
    }
}
