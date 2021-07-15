package com.chl.day08;

import java.util.Arrays;
import java.util.List;

/**
 * 创建一个字符串数组:{"one","two","three"}
 * 然后将该数组转换为一个List集合
 */
public class Test06 {
    public static void main(String[] args) {
        String[] array = {"one","two","three"};
        List list = Arrays.asList(array);  //Arrays.asList()数组转换为集合
        System.out.println("list = " + list);
    }
}
