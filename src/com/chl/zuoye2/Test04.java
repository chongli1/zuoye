package com.chl.zuoye2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 */
public class Test04 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入生产日期 (yyyy-MM-dd)：");
        String sDate = sc.nextLine();
        System.out.println("请输入保质期的天数：");
        String bDate = sc.nextLine();

        long time = 1000*60*60*24; //一天的毫秒数

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       // Date bDate1 = sdf.parse(bDate);//把输入的日期字符串转换为日期格式

        Date nowdate = new Date(); //获取当前的时间
        String date = sdf.format(nowdate);
        System.out.println("促销日期"+date);


    }
}
