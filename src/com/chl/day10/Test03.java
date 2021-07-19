package com.chl.day10;

import java.text.SimpleDateFormat;
import java.util.Date;

/*使用线程的sleep方法 做一个控制台显示时间 ,  格式是:  2021-07-17 23:45:动态的秒*/
public class Test03 {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
    }

    private static class MyThread extends Thread {
        //通过正则式来设置输出的时间格式
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        //重写run()方法


        @Override
        public void run() {
            while (true){
                Date date = new Date();
                String format = s.format(date);
                System.out.println("format = " + format);
                //间隔为1s
                try {
                    Thread.sleep(1000);
                    //break; //结束循环，只让循环一次
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


