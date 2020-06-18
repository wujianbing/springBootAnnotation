package com.example.conditional.conditional.Bean;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WindowsConditional implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //获取ioc使用的beanfactory
        ConfigurableListableBeanFactory context = conditionContext.getBeanFactory();
        //获取类加载器
        ClassLoader loader = conditionContext.getClassLoader();
        //获取当前环境信息
        Environment environment = conditionContext.getEnvironment();
        //获得bean的注册类
        BeanDefinitionRegistry registry = conditionContext.getRegistry();
        //获取当前系统名
        String pro = environment.getProperty("os.name");
        //包含windows
        if(pro.contains("Windows")){
            return true;
        }
        return false;
    }
}
