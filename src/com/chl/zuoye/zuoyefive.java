package com.chl.zuoye;

import java.util.Random;
import java.util.Scanner;

public class zuoyefive {
    public static void main(String[] args) {
        String str = random();
        System.out.println("验证码为："+str);
        System.out.println("请输入验证码（大小写不限）");
        Scanner sc = new Scanner(System.in);
        while (true){
            String input = sc.nextLine();
            if (str.toLowerCase().equals(input.toLowerCase())) {
                System.out.println("验证成功！");
                break;
            }else {
                System.out.println("验证码："+str);
                System.out.println("输入错误，请重新输入：");
            }
        }
    }

    private static String random() {
        Random rand = new Random();
        StringBuilder builder = new StringBuilder();
        for(int i = 0;i<5;i++){
            if(rand.nextInt(2) == 1){
                builder.append((char)('a'+rand.nextInt(26)));



            }else{
                builder.append((char)('A'+rand.nextInt(26)));

            }
  }
        return builder.toString();
    }


}
