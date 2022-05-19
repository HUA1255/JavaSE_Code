package com.itheima_01;

public class test03_chicken {
    public static void main(String[] args) {
        compute();
    }
    public static void compute(){
        int i,j,k;      // i一个5 j一个3 3k=1
        for (i=0;i<=20;i++){
            for (j=0;j<=33;j++){
                k=(100-i-j)/3;
                if(5*i+3*j+k==100 && i+j+3*k==100){
                    System.out.printf("有%d只鸡公，%d只鸡母，%d只鸡雏",i,j,k);
                    System.out.println();
                }
            }
        }
    }
}
