package com.youxiang.garbage_collection;

/**
 * @author: Rivers
 * @date: 2018/4/29
 */
public class TestTenuringThreshold2 {

    private static final int _1MB = 1024 * 1024;

    public static void testTenuringThreshold() {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[_1MB / 4];

        allocation2 = new byte[_1MB / 4];

        allocation3 = new byte[4 * _1MB];
        allocation4 = new byte[4 * _1MB];
        allocation4 = null;
        allocation4 = new byte[4 * _1MB];
    }

    /**
     * VM args:-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=1 -XX:+PrintTenuringDistribution
     * @param args
     */
    public static void main(String[] args) {
        testTenuringThreshold();
    }
}
