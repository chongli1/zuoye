package com.chl.day08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
*/
public class Test08 {
    public static void main(String[] args) {
        ArrayList<Date> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <3 ; i++) {
            System.out.println("请输入日期:");
            String s = scanner.nextLine();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");  //定义格式
            try {
                Date parse = format.parse(s);
                list.add(parse);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        Collections.sort(list);
        for (Date date : list) {
            System.out.println("date = " + date);
        }

    }
}
