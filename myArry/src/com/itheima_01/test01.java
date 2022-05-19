package com.itheima_01;
//输入三部曲:导包 创建对象  接受数据

import java.util.Scanner;

/*
    需求：输入星期数，显示今天的减肥计划
    周一：跑步
    周二：游泳
    周三：慢跑
    周四：动感单车
    周五：拳击
    周六：爬山
    周日：吃吃吃
*/
public class test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入今天的星期数：");
        int day = sc.nextInt();
        fnIf(day);
        fnSwitch(day);
        fnSeven();
    }
    public static void fnSeven(){
        for (int i=1;i<=100;i++){
            if (i%7==0||i/10==7||i%10==7){
                System.out.println(i+"过");
            }
        }
    }
    public static void fnSwitch(int day){
        switch (day){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢跑");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("吃吃吃");
                break;
            default:
                System.out.println("输入有误");
        }
    }
    public static void fnIf(int day){
        if(day==1){
            System.out.println("跑步");
        }else if(day==2){
            System.out.println("游泳");
        }else if(day==3){
            System.out.println("慢跑");
        }else if(day==4){
            System.out.println("动感单车");
        }else if(day==5){
            System.out.println("拳击");
        }else if(day==6){
            System.out.println("爬山");
        }else if(day==7){
            System.out.println("吃吃吃");
        }else{
            System.out.println("输入有误");
        }
    }
}
