package com.youxiang.out_of_memory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Rivers
 * @date: 2018/4/28
 */
public class RuntimeConstantPoolOOM {

    /**
     * VM args:-XX:PermSize=10M -XX:MaxPermSize=10M
     * 在JDK1.6以及之前的版本中，会抛出OutOfMemoryError：PermGen space错误，
     * 而在JDK1.7以上八本中则不会，程序会一直执行下去
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }
}
