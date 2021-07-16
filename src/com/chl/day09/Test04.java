package com.chl.day09;

import java.io.File;

/**
 * 获取并输出当前目录下的所有文件和目录的名字
 */
public class Test04 {
    public static void main(String[] args) {
        File file = new File("a");  //当前所存在的目录
        File[] files = file.listFiles();  //listFiles():所有文件
        for (File file1 : files) {
            System.out.println("所有文件:"+file1.getName());
        }
        System.out.println("目录名:"+file.getName());
    }
}
