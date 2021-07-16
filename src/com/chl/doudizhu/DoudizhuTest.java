package com.chl.doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 斗地主 模拟 洗牌
 * 牌数：54张 大王， 小王，1-10，J，Q，K，四个
 * ♥，♠，♣，♦
 *
 */
public class DoudizhuTest {
    public static void main(String[] args) {
        //1、先造出 4个 花色
        List<String> colors = new ArrayList<>();
        colors.add("♥");
        colors.add("♠");
        colors.add("♣");
        colors.add("♦");
        //2、造出10 个 2-10
        ArrayList<String> numbers = new ArrayList<>();
        for (int i = 2; i <=10 ; i++) {
            numbers.add(i+"");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");
        System.out.println("numbers = " + numbers);

        //3、上面的 colors 和 number进行一个 整合
        //放入到一个 新的集合中 如果做到呢？嵌套循环
        List<String> piker = new ArrayList<>();
        //Set<String> piker = new HashSet<>();
        for (String color : colors) {
            for (String number : numbers) {
                piker.add(color+number);
            }
        }
        piker.add("BigKing");
        piker.add("littleKing");
        System.out.println("piker = " + piker);
        System.out.println("piker = " + piker.size());
        //如果使用 Set 也无法分开排序，有个的方法可以 打乱他的排序，只能打断list
        //因为set是无序的
        Collections.shuffle(piker);//打断list排序
        System.out.println("piker = " + piker);
        Collections.sort(piker); //list 的快速排序（不是人工指定的排序）
        System.out.println("piker = " + piker);
        //给 player1 player2 player3 发牌
        ArrayList<String> player1 = new ArrayList<>();//玩家1
        ArrayList<String> player2 = new ArrayList<>();//玩家2
        ArrayList<String> player3 = new ArrayList<>();//玩家3
        ArrayList<String> dipai = new ArrayList<>(); //3张底牌
        for (int i = 0; i <piker.size() ; i++) {
            String pName = piker.get(i); //每张扑克牌
            if (i>=51) {
                dipai.add(pName);
            }else {
                //给玩家1，2，3 发 前面51张牌
                if(i%3==0){
                    player1.add(pName);
                }else if (i%3==1){
                    player2.add(pName);
                }else{
                    player3.add(pName);
                }
            }
        }
        //查看牌
        System.out.println("dipai = " + dipai);
        System.out.println("player1 = " + player1);
        System.out.println("player1 = " + player1.size());
        System.out.println("player2 = " + player2);
        System.out.println("player2 = " + player2.size());
        System.out.println("player3 = " + player3);
        System.out.println("player3 = " + player3.size());

        Collections.sort(piker); //list 的快速排序（不是人工指定的排序，）
        System.out.println("piker = " + piker);
        //作业3：规定个地主， 规定 谁摸到红桃3 谁是地主，注意：底牌里面不能包含红桃3
        boolean flag = true;
        while (flag){


        }


    }

}
