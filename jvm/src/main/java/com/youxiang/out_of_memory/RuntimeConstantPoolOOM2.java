package com.youxiang.out_of_memory;

/**
 * @author: Rivers
 * @date: 2018/4/28
 */
public class RuntimeConstantPoolOOM2 {

    /**
     * 在JDK1.6中，会返回两个false，因为intern()方法会把首次遇到的字符串实例复制到永久代中，
     * 返回的也是永久代中这个字符串实例的引用，而由StringBuilder创建的字符串实例在Java堆上，
     * 所以必然不是同一个引用，所以返回false
     * 而在JDK1.7中，会返回一个true，一个false，因为intern()方法不再复制实例，只是再常量池中记录首次出现
     * 的实例引用，因此intern()返回的引用和StringBuilder创建的字符串实例是同一个，所以第一个返回true，而
     * 对于第二个，由于"java"这个字符串在执行StringBuilder.toString()方法前出现过，字符串常量池中已经有
     * 它的引用了，不符合"首次出现"原则，所以返回false
     * @param args
     */
    public static void main(String[] args) {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);
    }
}
