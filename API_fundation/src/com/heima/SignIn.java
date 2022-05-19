package com.heima;

import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "xiaohei";
        int password = 123456;
        for (int i=0;i<3;i++){
            System.out.println("请输入用户名：");
            Scanner sc = new Scanner(System.in);
            String un = sc.nextLine();
            System.out.println("请输入密码：");
            Scanner scp =new Scanner(System.in);
            int ps = scp.nextInt();
            if (password==ps&&un.equals(username)){
                System.out.println("success!");
                return;
            }else {
                System.out.println("用户名或者密码错误，请重新输入！");
            }
        }
        System.out.println("Fall!");
    }
}
