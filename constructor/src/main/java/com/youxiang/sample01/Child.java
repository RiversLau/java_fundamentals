package com.youxiang.sample01;

/**
 * @author: Rivers
 * @date: 2018/4/27
 */
public class Child {

    public Child() {
        System.out.println("Same Package Child");
    }

    public void testAccess() {
        Parent parent = new Parent();
        System.out.println(parent);
    }
}
