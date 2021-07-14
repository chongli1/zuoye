package com.chl.zuoye2;
/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 */
import java.util.Date;

public class Test01 {
    public static void main(String[] args) {
        //定义当前时间
        Date date = new Date();
        System.out.println("当前日期：" + date);
        //改写为我们自己的时间
        long time = date.getTime();  //获得真实时间
        //查看3天后此时的时间
        time = time+ 1000*60*60*24*3L;
        date.setTime(time);
        System.out.println("三天后此时的时间：" + date);
    }
}
