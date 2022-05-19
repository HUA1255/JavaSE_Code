package com.itheima_01;

public class rryDemo {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] brr = {1,2,3};
        for (int i=0;i<3;i++){
            arr[i] = i;
            System.out.printf(String.valueOf(arr[i]));
            System.out.printf(String.valueOf(brr[i]));
        }
        System.out.println(arr[1]);
        is_Odd(2);
        is_Odd(3);
        getMax(2,3);
        getMax(2,3,4);
    }
    public static void is_Odd(int num){
        if(num%2==0){
            System.out.println("odd");
        }else{
            System.out.println("not odd");
        }
    }
    public static void getMax(int a,int b){
        int Max = a>b?a:b;
        System.out.println(Max);
    }
    public static void getMax(int a,int b,int c){
        int Max = a>b?a:b;
        Max = c>Max?c:Max;
        System.out.println(Max);

    }
    public static boolean compare(int a,int b){
        System.out.println("int");
        return a==b;
    }
    public static boolean compare(byte a,byte b){
        System.out.println("byte");
        return a==b;
    }
    public static boolean compare(long a,long b){
        System.out.println("long");
        return a==b;
    }
    public static boolean compare(double a,double b){
        System.out.println("double");
        return a==b;
    }
}
