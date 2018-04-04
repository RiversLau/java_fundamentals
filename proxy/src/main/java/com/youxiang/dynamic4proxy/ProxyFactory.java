package com.youxiang.dynamic4proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: Rivers
 * @date: 2018/4/4
 */
public class ProxyFactory {

    private Object target;
    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("动态代理--事务开始");
                Object returnValue = method.invoke(target, args);
                System.out.println("动态代理--事务结束");
                return returnValue;
            }
        });
    }
}
