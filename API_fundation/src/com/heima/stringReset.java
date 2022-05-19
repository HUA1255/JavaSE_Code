package com.heima;

// 字符串翻转
public class stringReset {
    public static void main(String[] args) {
        String s="qwer";
        System.out.println(stringRevers(s));
    }
    public static String stringRevers(String s){
        String ss = "";
        for (int i=s.length()-1;i>=0;i--){
            ss+=s.charAt(i);
        }
        return ss;
    }
}
