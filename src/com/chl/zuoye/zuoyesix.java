package com.chl.zuoye;

import java.util.Scanner;

public class zuoyesix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要计算的表达式：");
        String s = sc.nextLine();
        char c = s.charAt(1);
        String s1 = String.valueOf(c);
        if(s1.equals("+")){
            System.out.println(jia(s));
        }else  if (s1.equals("-")){
            System.out.println(jian(s));
        }else if (s1.equals("*")){
            System.out.println(cheng(s));
        }else if (s1.equals("/")){
            System.out.println(chu(s));
        }
    }

    private static int chu(String str) {
        String [] s = str.split("\\/");
        Integer integer = Integer.valueOf(s[0]);
        Integer integer1 = integer.valueOf(s[1]);
        return integer/integer1;
    }

    private static int cheng(String str) {
        String [] s = str.split("\\*");
        Integer integer = Integer.valueOf(s[0]);
        Integer integer1 = integer.valueOf(s[1]);
        return integer*integer1;
    }

    private static int jian(String str) {
        String [] s = str.split("-");
        Integer integer = Integer.valueOf(s[0]);
        Integer integer1 = integer.valueOf(s[1]);
        return integer-integer1;

    }

    private static int jia(String str) {
        String [] s = str.split("\\+");
        Integer integer = Integer.valueOf(s[0]);
        Integer integer1 = Integer.valueOf(s[1]);
        return integer+integer1;
    }
}
