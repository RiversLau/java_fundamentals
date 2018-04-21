package com.youxiang;

/**
 * @author: Rivers
 * @date: 2018/4/20
 */
public class StringSample {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        // == 判断两个字符串是否存储在同一个位置，但是也有可能两个字符串内容相同，存储在不同的位置，
        // 所以下面的判断有可能是成立的
        if (s1 == s2) {
            System.out.println("Equals");
        }

        // 注意
    }
}
