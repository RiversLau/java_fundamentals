package com.youxiang.garbage_collection;

/**
 * @author: Rivers
 * @date: 2018/4/29
 */
public class TestPretenureSizeThreshold {

    private static final int _1MB = 1024 * 1024;

    public static void testPretenureSizeThreshold() {
        byte[] allocation;
        allocation = new byte[8 * _1MB];
    }

    /**
     * VM args:-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=3145728
     * @param args
     */
    public static void main(String[] args) {
        testPretenureSizeThreshold();
    }
}
