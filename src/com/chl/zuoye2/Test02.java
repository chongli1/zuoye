package com.chl.zuoye2;
/**
 * 将当前系统时间以"yyyy-MM-dd HH:mm:ss"格式输出
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
    public static void main(String[] args) {
        //获取当前时间
        Date date = new Date();
        System.out.println("date = " + date);
        //格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(date);  //format 规定日期/时间的输出格式
        System.out.println("time = " + time);


    }
}
