package com.spring.framework.aop.advisor;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyBeforeAdvisor implements MethodBeforeAdvice{  
    public void before(Method method, Object[] args, Object target)throws Throwable {  
        System.out.println("method before advice runs successfully");  


    }  
}  