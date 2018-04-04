package com.youxiang.cglib4proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: Rivers
 * @date: 2018/4/4
 */
public class ProxyFactory implements MethodInterceptor {

    private Object target;
    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        Enhancer en = new Enhancer();
        en.setSuperclass(target.getClass());
        en.setCallback(this);
        return en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib动态代理--事务开始");
        Object returnValue = method.invoke(target, args);
        System.out.println("cglib动态代理--事务结束");
        return returnValue;
    }
}
