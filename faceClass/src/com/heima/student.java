package com.heima;

public class student {
    String name;
    private int age;

    public student(String name,int age){
        this.name = name;
        this.age =age;
    }

    public void study(){
        System.out.println("好好学习，天天向上");
    }
    public void doHomework(){
        System.out.println("冲冲冲");
    }
    public void setAge(int age){
        if (age>=0&&age<=150){
            this.age = age;
        }else {
            System.out.println("输入有误");
        }
        return ;
    }
    public int getAge(){
        return age;
    }

}
