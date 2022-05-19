package com.heima;

// 拼接数组，用方法
public class pingJieShuZu {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(arrToString(arr));
    }
    public static String arrToString(int[] arr){
        String s ="[";
        for (int i=0;i<arr.length;i++){
            s+=arr[i];
            if (i!=arr.length-1){
                s+=',';
            }else {
                s+=']';
            }
        }
        return s;
    }
}
