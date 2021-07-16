package com.chl.day09;

import java.io.File;

/**
 * 获取并输出当前目录下所有文件的名字
 */
public class Test06 {
    public static void main(String[] args) {
        File file = new File("a");  //当前所存在的目录
        File[] files = file.listFiles();  //listFiles():所有文件
        for (File file1 : files) {
            System.out.println("所有文件:"+file1.getName());
        }
    }
}
