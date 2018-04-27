package com.youxiang.sample01;

/**
 * @author: Rivers
 * @date: 2018/4/27
 */
public class Parent {

    /**
     * 被protected修饰的方法只能被同包下的类访问
     */
    protected Parent() {
        System.out.println("Protected Parent");
    }
}
