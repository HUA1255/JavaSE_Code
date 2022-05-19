package com.itheima_01;

import java.util.Scanner;

public class test05_arrFind {
    public static void main(String[] args) {
        System.out.println("输入数字，查看有无相同值");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr={19,28,37,46,50};
        arrFind(arr,num);
    }
    public static void arrFind(int[] arr,int num){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==num){
                System.out.printf("第%d个元素相同，值为%d",i,num);
                return;
            }
        }
        System.out.println("无相同值");
    }
}
