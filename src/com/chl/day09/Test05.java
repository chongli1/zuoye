package com.chl.day09;

import java.io.File;
import java.util.Scanner;

/**
 * 要求用户输入一个文件或目录名，并删除当前目录下的该文件或目录。
 * 可自行手动先在当前项目目录中创建一个要删除的文件或目录，若是目录，还可以
 * 在该目录中继续创建若干级目录和文件。
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个文件或目录名：");
        String s = scanner.nextLine();
        File file = new File("a" + s);
        boolean files = file.exists();
        if (files) {
            file.delete();
            System.out.println("文件或目录删除成功： " + files);
        }else{
            System.out.println("文件或目录不存在");
        }

    }
}
