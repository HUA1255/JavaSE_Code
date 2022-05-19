package com.itheima_01;

public class test06_arrReset {
    public static void main(String[] args) {
        int[] arr = {19,28,37,46,50};
        printArr(arr);
        reset(arr);
        printArr(arr);
    }
    public static void reset(int[] arr){
         int front = 0;
         int rear = arr.length-1;
         int temp;
         while (front<rear){
             temp = arr[front];
             arr[front] = arr[rear];
             arr[rear] = temp;
             front++;
             rear--;
         }
    }
    public static void printArr(int[] arr){
        System.out.printf("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i==arr.length-1){
            }else {
                System.out.printf(",");
            }
        }
        System.out.println("]");
    }
}
