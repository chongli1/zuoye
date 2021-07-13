package com.chl.zuoye;

import java.util.Scanner;

public class zuoyefour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入email地址：");
        String s = sc.nextLine();
        int i = s.indexOf("@");
        String sb = s.substring(0, i);
        System.out.println("sb = " + sb);


    }



}
