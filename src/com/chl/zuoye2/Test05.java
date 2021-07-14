package com.chl.zuoye2;

import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的身份证号：");
        String s = scanner.nextLine();
        if(s.length()==18){
            //截取身份证中的年、月、日
            int nian = Integer.parseInt(s.substring(6, 10));
            int yue = Integer.parseInt(s.substring(10, 12));
            int ri = Integer.parseInt(s.substring(12, 14));
            String a = nian + "-" + yue + "-" + ri;
            System.out.println("出生年月日为： " + a);
            //得到20岁生日当天的日期
            int TwentyBirthDay = nian + 20;
            String b = TwentyBirthDay + "-" + yue + "-" + ri;
            System.out.println("20岁生日的日期为：" + b);
            //当周的周三为:2012-07-18
        }
    }
}
