package com.chl.zuoye;
/**
 * 1:输出字符串"HelloWorld"的字符串长度
 * 2:输出"HelloWorld"中"o"的位置
 * 3:输出"HelloWorld"中从下标5出开始第一次出现"o"的位置
 * 4:截取"HelloWorld"中的"Hello"并输出
 * 5:截取"HelloWorld"中的"World"并输出
 * 6:将字符串"  Hello   "中两边的空白去除后输出
 * 7:输出"HelloWorld"中第6个字符"W"
 * 8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的。
 * 9:将"HelloWorld"分别转换为全大写和全小写并输出。
 */
public class zuoyeone {
    public static void main(String[] args) {
        String str = "HelloWorld";
        test1(str);
        test2(str);
        test3(str);
        test4(str);
        test5(str);
        test6(str);
        test7(str);
        test8(str);
        test9(str);
    }

    private static void test9(String str) {
        //9:将"HelloWorld"分别转换为全大写和全小写并输出。
        String s = "HelloWorld";
        String upperCase = s.toUpperCase();
        String lowerCase = s.toLowerCase();
        System.out.println("upperCase = " + upperCase);
        System.out.println("lowerCase = " + lowerCase);
    }

    private static void test8(String str) {
        // 8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的。
        boolean h = str.startsWith("h");
        boolean ld = str.endsWith("ld");
        System.out.println("h = " + h);
        System.out.println("ld = " + ld);
    }

    private static void test7(String str) {
        //7:输出"HelloWorld"中第6个字符"W"
        char c = str.charAt(5);
        System.out.println("c = " + c);
    }

    public static void test6(String str) {
        //6:将字符串"  Hello   "中两边的空白去除后输出
        String str1 = " Hello ";
        String trim = str1.trim();
        System.out.println("trim = " + trim);
    }

    public static void test5(String str) {
        //5:截取"HelloWorld"中的"World"并输出
        String substring = str.substring(5,10);
        System.out.println("substring = " + substring);
    }

    public static void test4(String str) {
        //4:截取"HelloWorld"中的"Hello"并输出
        String substring = str.substring(0, 5);
        System.out.println("substring = " + substring);
    }

    public static void test3(String str) {
        //3:输出"HelloWorld"中从下标5出开始第一次出现"o"的位置
        int i = str.indexOf("o", 5);
        System.out.println("i = " + i);
    }

    public static void test2(String str) {
        //2:输出"HelloWorld"中"o"的位置
        int i = str.indexOf("o");
        System.out.println("i = " + i);
    }

    public static void test1(String str) {
        //1:输出字符串"HelloWorld"的字符串长度
        StringBuilder sb = new StringBuilder(str);
        int length = sb.length();
        System.out.println("length = " + length);
    }


}
