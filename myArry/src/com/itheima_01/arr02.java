package com.itheima_01;

import javax.swing.*;

public class arr02 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        printArr(arr);
    }
    public static void printArr(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i==4){
            }else {
                System.out.printf(",");
            }
        }
        System.out.print("]");
    }
}
