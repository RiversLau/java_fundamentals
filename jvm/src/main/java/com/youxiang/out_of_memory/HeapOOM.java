package com.youxiang.out_of_memory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Rivers
 * @date: 2018/4/28
 */
public class HeapOOM {

    /**
     * VM args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
     * @param args
     */
    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true) {
            list.add(new OOMObject());
        }
    }

    static class OOMObject {

    }
}
