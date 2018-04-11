package com.youxiang.collection;

import java.util.ArrayList;

/**
 * @author: Rivers
 * @date: 2018/4/11
 */
public class ArrayListSample {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(null);
        al.add(null);
        al.set(1, "abc");
        System.out.println(al.size());
    }
}
