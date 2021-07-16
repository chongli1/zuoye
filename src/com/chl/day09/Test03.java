package com.chl.day09;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个目录名并使用File在当前目录下创建出来。
 * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个目录：");
        String input = sc.nextLine().trim(); //trim()：去除两边空格
        File file = new File("a");
        boolean nowfile = file.exists();
        if (!nowfile) {
            file.mkdirs();  //创建目录
            System.out.println("目录已存在，可创建副本 ：" + nowfile);
        }else{
            int index = 0;
            while(nowfile){
                index++;
                file = new File("a_副本"+index+"a");
                nowfile = file.exists();
            }
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("目录名:"+file.getName());
    }
}
