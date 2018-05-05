package com.youxiang.sample03;

/**
 * @author: Rivers
 * @date: 2018/5/3
 */
public class AbstractTest {

    public static void main(String[] args) {
        Children children = new Children();
        System.out.println(children);
        Children children1 = new Children("Tom");
        System.out.println(children1);
    }
}
