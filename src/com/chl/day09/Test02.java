package com.chl.day09;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名并使用File在当前目录下创建出来。
 * 若该文件已经存在，则提示用户该文件已经存在。并创建该文件副本：
 * 例如:用户输入"test.txt".若该文件已存在，提示用户存在后，创建名为：test_副本1.txt 的文件
 * 若该文件也存在了，则创建名为:test_副本2.txt 的文件，以此类推
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件名:");
        String input = sc.nextLine().trim(); //trim():去除两端的空格
        File file = new File("test.txt");
        System.out.println("file = " + file);
        boolean nowfile = file.exists();
        if (!nowfile) { //如果文件不存在，则创建文件
            try {
                file.createNewFile();
                System.out.println("nowfile = " + nowfile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            int index = 0;
            while(nowfile){
                index++;
                file = new File("test_副本"+index+".txt");
                nowfile = file.exists();
            }
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("文件名:"+file.getName());
    }


}
