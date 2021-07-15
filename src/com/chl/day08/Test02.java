package com.chl.day08;

import java.util.ArrayList;
import java.util.Iterator;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
            a.add("1");
            a.add("$");
            a.add("2");
            a.add("$");
            a.add("3");
            a.add("$");
            a.add("4");
        System.out.println("a = " + a);
        Iterator<String> iter = a.iterator();
        while (iter.hasNext()){
            String next = iter.next();
            if (next == "$") {
                iter.remove();
            }
            System.out.println(a);
            for (String s : a) {
                System.out.println("s = " + s);
            }
        }
    }


    }

