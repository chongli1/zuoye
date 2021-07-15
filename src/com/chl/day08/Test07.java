package com.chl.day08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * 创建一个List集合，并存放10个随机数，然后排序该集合
 * 后输出
 */
public class Test07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            Random random = new Random(); //生成随机数对象
            int num = random.nextInt(100);  //因为10个数太少，所以是在100里面随机抽取10个数存的list集合里
            list.add(num);
            Collections.sort(list);     //排序
        }

        System.out.println("list = " + list);

    }
}
