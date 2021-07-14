package com.chl.zuoye;
/**
 * 得到一个数的每一位
 * 判断一个数是不是回文数，是就输出 这个数是回文数，不是就输出 这个数不是回文数
 * 回文数：一个数为5位数，个位 == 万位， 十位 == 千位  eg：12321
 */

import java.util.Scanner;

public class huiwenshu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        String s = sc.nextLine();
        int in = 12321;
        //拿到每一位
        int ge = in % 10;
        int shi = in / 10 % 10;
        int bai = in / 100 % 10;
        int qian = in / 1000 % 10;
        int wan = in / 10000;
        //判断 个位 == 万位 && 十位 == 千位
        if (ge == wan && shi == qian) {
            System.out.println("数字" + in + "是回文数");
        }else{
            System.out.println("数字" + in + "不是回文数");
        }
    }
}
