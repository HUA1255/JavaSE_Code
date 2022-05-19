package com.itheima_01;

import java.util.Scanner;

public class test07_arrPoint {
    public static void main(String[] args) {
        int[] arr = new int[6];
        for (int i=0;i<6;i++){
            System.out.println("输入你的评分：");
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }
        System.out.println(point(arr));
    }
    public static int point(int[] arr){
        int min,max,point;
        int sum=0;
        min = max =arr[0];
          for (int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            if(arr[i]<min){
                min = arr[i];
            }else if(arr[i]>max) {
                max =arr[i];
            }
        }
        point = (sum-min-max)/(arr.length-2);
        return point;
    }
}
