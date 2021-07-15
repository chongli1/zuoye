package com.chl.day08;

import java.util.ArrayList;

/**
 * 创建一个List集合，并添加元素0-9
 * 将集合转换为一个Integer数组并输出数组每一个元素
 */
public class Test05 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }
        Object[] array = list.toArray();
        for (int i = 0; i <array.length ; i++) {
            System.out.println("i = " + i);
        }
    }
}
