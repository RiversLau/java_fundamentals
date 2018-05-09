package com.youxiang.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: Rivers
 * @date: 2018/5/9
 */
public class ArrayListSample03 {

    public static void main(String[] args) {
        List<Integer> dataListt = new ArrayList<>(Arrays.asList(10, 20, 30, null));
        modify(dataListt);
        resetOne(dataListt);

        int sum = 0;
        for (Integer in : dataListt) {
            sum += in;
        }
        System.out.println(sum);
    }

    private static void modify(List<Integer> dataList) {
        dataList.subList(2, 4).set(0, 40);
        dataList = new ArrayList<>(dataList);
        dataList.set(3, 50);
    }

    private static void resetOne(List<Integer> dataList) {
        dataList.set(3, 100);
    }
}
