package com.youxiang.out_of_memory;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * @author: Rivers
 * @date: 2018/4/28
 */
public class JavaMethodAreaOOM {

    /**
     * VM args:-XX:PermSize=10M -XX:MaxPermSize=10M
     * 由于JDK8中已经移除PermSize、MaxPermSize，虚拟机直接忽略了该参数，导致无法测试出问题
     * @param args
     */
    public static void main(String[] args) {
        while (true) {
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(OOMObject.class);
            enhancer.setUseCache(false);
            enhancer.setCallback((MethodInterceptor) (o, method, objects, methodProxy) -> methodProxy.invokeSuper(o, objects));
            enhancer.create();
        }
    }

    static class OOMObject {

    }
}
