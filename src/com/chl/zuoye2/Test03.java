package com.chl.zuoye2;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的生日（格式为yyyy-MM-dd）");
        String birthday = sc.nextLine();

        Date birDate = sdf.parse(birthday);
        Date now = new Date();
        long birlong = birDate.getTime();
        long nowlong = now.getTime();

        long agelong = nowlong-birlong;
        long weeks = agelong /1000 / 60 / 60 /24;
        long week = weeks/7;
        System.out.println("到今天为止经历了:" + week+ "周");

    }
}
