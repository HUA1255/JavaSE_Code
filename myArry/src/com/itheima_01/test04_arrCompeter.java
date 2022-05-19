package com.itheima_01;

public class test04_arrCompeter {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] brr={1,2,3,4};
        int[] crr={2,3,4,5};
        System.out.println(compete(arr, brr));
        System.out.println(compete(arr, crr));
    }
    public static boolean compete(int[] arr,int[] brr){
        if (arr.length==brr.length){
            int flag = 0;
            for (int i=0;i<arr.length;i++){
                if (arr[i]!=brr[i]){
                    flag=1;
                    break;
                }
            }
            if (flag==0){
                return true;
            }else return false;
        }else {
            return false;
        }
    }
}
