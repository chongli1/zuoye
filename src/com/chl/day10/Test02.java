package com.chl.day10;

import java.io.File;

/* 遍历 你D盘 的 其中一个文件夹 , 并查找出 文件后缀名带有.class的文件*/
public class Test02 {
    public static void main(String[] args) {
        search("F:\\a");
    }

    public static void search(String path) {
        File dir = new File(path);
        File[] files = dir.listFiles();       //获取F盘下a文件夹中的所有对象
        if (null != files) {
            for (File file : files) {
                if (file.isDirectory())        //文件夹则递归寻找，后缀为java文件则输出名字
                    search(file.getAbsolutePath());  //getAbsolutePath()：返回抽象路径名的绝对路径名字符串
                else if (file.isFile() && file.getName().endsWith(".class"))
                    System.out.println(file.getName());
            }
        }

    }
}
