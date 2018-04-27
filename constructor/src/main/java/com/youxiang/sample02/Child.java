package com.youxiang.sample02;

import com.youxiang.sample01.Parent;

/**
 * @author: Rivers
 * @date: 2018/4/27
 */
public class Child extends Parent {

    public Child() {
        super();
        System.out.println("Not same package child");
    }
}
