package com.chl.zuoye;

/*写一个 private 方法, 需要 传一个 string 的 网址参数, 返回 处理后的数据.
 假定 大数据获取了 很多网址, 我想要 www -----  com 之间的内容
有一下  几类网址
 www.oracle.com  ---->  oracle
 www.oracle.com.cn  ---->  oracle
 www.java.oracle.com.cn  ---->  java.oracle
 www.lol.game.qq.com.cn  ---->  lol.game.qq
 www.game.mycom.com.cn  ---->  game.mycom
 www.girl.mycom.com.cn  ---->  girl.mycom
 www.computer.mycom.com.cn  ---->  computer.mycom
 */
public class zuoyeseven {
    public static void main(String[] args) {
        String str = "www.oracle.com";
        String str1 = "www.oracle.com.cn";
        String str2 = "www.java.oracle.com.cn";
        String str3 = "www.lol.game.qq.com.cn";
        String str4 = "www.girl.mycom.com.cn";
        String str5 = "www.computer.mycom.com.cn";
        String str6 = "www.game.mycom.com.cn";

        test(str);
        test2(str1);
        test3(str2);
        test4(str3);
        test5(str4);
        test6(str5);
        test7(str6);




    }

    private static void test7(String str6) {
        String sb = str6.substring(4, 14);
        System.out.println("sb = " + sb);
    }

    private static void test6(String str5) {
        String sb = str5.substring(4, 18);
        System.out.println("sb = " + sb);
    }
    private static void test5(String str4) {
        String sb = str4.substring(4, 14);
        System.out.println("sb = " + sb);
    }
    private static void test4(String str3) {
        String sb = str3.substring(4, 15);
        System.out.println("sb = " + sb);
    }

    private static void test3(String str2) {
        String sb = str2.substring(4, 15);
        System.out.println("sb = " + sb);
    }

    private static void test2(String str1) {
        String sb = str1.substring(4, 10);
        System.out.println("sb = " + sb);
    }

    private static void test(String str) {
        String sb = str.substring(4, 10);
        System.out.println("sb = " + sb);
    }


}
