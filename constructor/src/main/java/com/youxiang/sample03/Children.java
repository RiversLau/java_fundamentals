package com.youxiang.sample03;

/**
 * @author: Rivers
 * @date: 2018/5/3
 */
public class Children extends Parent {

    public Children() {
        System.out.println("Hello Children");
    }

    public Children(String str) {
        super(str);
        System.out.println("Hello Children: " + str);
    }
}
