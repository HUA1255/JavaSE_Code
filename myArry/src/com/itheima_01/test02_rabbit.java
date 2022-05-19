package com.itheima_01;


// 不死神兔子🐰
public class test02_rabbit {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0]=1;
        arr[1]=1;
        rb(arr);
    }
    public static void rb(int[] arr){
        for (int i=2;i<20;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(arr[19]);
    }
    // 递归方式实现
    public static void fb(){

    }
}
