package com.chl.day09;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 通过File输出当前项目目录下的文件"myfile.txt"的名字，大小，最后修改时间。
 * 最后修改时间格式如:2016-03-23 14:22:16
 */
public class Test01 {
    public static void main(String[] args) {
        File file = new File("myfile.txt");  //设置文件路径
        System.out.println("file = " + file);
        try {
            boolean newFile = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long length = file.length();
        System.out.println("length = " + length);

        Date fileTime = new Date(file.lastModified());  //lastModified ()方法可以用于返回文件最后一次被修改的时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(fileTime);
        System.out.println("文件最后修改的时间为： " + format);
    }
}
