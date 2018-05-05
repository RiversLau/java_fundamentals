package com.youxiang.jconsole;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Rivers
 * @date: 2018/4/30
 */
public class JConsoleTest {

    public static void main(String[] args) throws InterruptedException {
        fillHeap(1000);
    }

    public static void fillHeap(int num) throws InterruptedException {
        List<OOMObject> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Thread.sleep(50);
            list.add(new OOMObject());
        }
        System.gc();
    }

    static class OOMObject {
        public byte[] placeHolder = new byte[64 * 1024];
    }
}
