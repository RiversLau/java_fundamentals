package com.youxiang.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: Rivers
 * @date: 2018/5/9
 */
public class ArrayListSample02 {

    /**
     * 重点是sublist方法
     * 该方法返回的是父list的一个视图，从fromIndex（包含），到toIndex（不包含）。fromIndex=toIndex 表示子list为空
     * 父子list做的非结构性修改（non-structural changes）都会影响到彼此：所谓的“非结构性修改”，是指不涉及到list的大小改变的修改。相反，结构性修改，指改变了list大小的修改。
     * 对于结构性修改，子list的所有操作都会反映到父list上。但父list的修改将会导致返回的子list失效
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> dataList = new ArrayList<>(Arrays.asList(10, 20, 30));
        List<Integer> subList = dataList.subList(1, 3);
        for (Integer subIndex : subList) {
            System.out.println(subIndex);
        }
        System.out.println("+++++++++++++++++++++");
        for (Integer index : dataList) {
            System.out.println(index);
        }
        System.out.println("+++++++++++++++++++++");
        subList.set(0, 30);
        for (Integer index : dataList) {
            System.out.println(index);
        }
    }
}
