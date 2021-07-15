package com.chl.day08;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        //创建c1集合
        ArrayList<String> c1 = new ArrayList<>();
            c1.add("one");
            c1.add("two");
            c1.add("three");
        System.out.println("c1 = " + c1);
        //创建c2集合
        ArrayList<String> c2 = new ArrayList<>();
            c2.add("four");
            c2.add("five");
            c2.add("six");
        System.out.println("c2 = " + c2);
        //将c2元素全部存入c1集合
        c1.addAll(c2);
        System.out.println("c1 = " + c1);
        //创建c3集合
        ArrayList<String> c3 = new ArrayList<>();
        c3.add("one");
        c3.add("six");
        //看集合c1是否包含集合c3的所有元素
        boolean a =c1.containsAll(c3);
        System.out.println("a = " + a);
        //将c1集合中的"two"删除后再输出c1集合
        boolean b = c1.remove("two");
        System.out.println("c1 = " + c1);



    }
}
