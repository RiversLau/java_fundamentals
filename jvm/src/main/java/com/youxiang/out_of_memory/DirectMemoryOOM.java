package com.youxiang.out_of_memory;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @author: Rivers
 * @date: 2018/4/28
 */
public class DirectMemoryOOM {

    private static final int _1MB = 1024 * 1024;

    /**
     * VM args:-Xmx20M -XX:MaxDirectMemorySize=10M
     * @param args
     * @throws IllegalAccessException
     */
    public static void main(String[] args) throws IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true) {
            unsafe.allocateMemory(_1MB);
        }
    }
}
