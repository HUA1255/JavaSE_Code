package com.heima;

import java.util.Scanner;

// 遍历字符串案例
public class overString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        for (int i=0;i<line.length();i++){
            System.out.println(line.charAt(i));
        }
    }
}
