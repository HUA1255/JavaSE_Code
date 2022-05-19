package com.heima;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentsManger {
    public static void main(String[] args) {
        int flag=0;
        ArrayList<Students> students = new ArrayList<Students>();
        while (flag!=5){
            mainShow();
            Scanner sc = new Scanner(System.in);
            flag = sc.nextInt();
            switch (flag){
                case 1:
                    addStudent(students);
                    break;
                case 2:
                    delStudent(students);
                    break;
                case 3:
                    altStudent(students);
                    break;
                case 4:
                    showStudents(students);
                    break;
                case 5:
                    level();
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入！");
            }
        }


    }

    // 主界面编写
    public static void mainShow(){
        System.out.println("--------欢迎来到学生管理界面--------");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生信息");
        System.out.println("4.查看所有学生信息");
        System.out.println("5.退出管理系统");
        System.out.println("请输入你选择的数字：");
    }

    public static void addStudent(ArrayList<Students> arr){
        System.out.println("请输入学生的学号：");
        Scanner sc = new Scanner(System.in);
        int studentID = sc.nextInt();
        System.out.println("请输入学生的姓名：");
        Scanner sc1 = new Scanner(System.in);
        String name = sc1.nextLine();
        System.out.println("请输入学生的地址：");
        Scanner sc3 = new Scanner(System.in);
        String address = sc3.nextLine();
        System.out.println("请输入学生的年龄：");
        Scanner sc4 = new Scanner(System.in);
        int age = sc4.nextInt();

        Students su = new Students(studentID,name,age,address);
        arr.add(su);

        System.out.println("添加成功！");
    }
    public static void delStudent(ArrayList<Students> arr){
        System.out.println("请输入要删除学生的学号：");
        Scanner sc = new Scanner(System.in);
        int studentID = sc.nextInt();
        for (int i=0;i<arr.size();i++){
            Students su = arr.get(i);
            if (su.getStudentID() == studentID){
                arr.remove(i);
                System.out.println("删除成功！");
                return;
            }
        }
        System.out.println("查无此号，请确认有无输错！");
    }
    public static void altStudent(ArrayList<Students> arr){
        System.out.println("请输入要修改学生的学号：");
        Scanner sc = new Scanner(System.in);
        int studentID = sc.nextInt();
        for (int i=0;i<arr.size();i++){
            if (arr.get(i).getStudentID()==studentID){
                System.out.println("请输入要修改部分的数字：");
                System.out.println("1.学号");
                System.out.println("2.姓名");
                System.out.println("3.年龄");
                System.out.println("4.地址");
                Scanner sc0 = new Scanner(System.in);
                int flag = sc0.nextInt();
                switch (flag){
                    case 1:
                        System.out.println("请输入学生学号：");
                        Scanner sc1 = new Scanner(System.in);
                        int ID = sc1.nextInt();
                        arr.get(i).setStudentID(ID);
                        break;
                    case 2:
                        System.out.println("请输入学生姓名：");
                        Scanner sc2 = new Scanner(System.in);
                        String name = sc2.nextLine();
                        arr.get(i).setName(name);
                        break;
                    case 3:
                        System.out.println("请输入学生年龄：");
                        Scanner sc3 = new Scanner(System.in);
                        int age = sc3.nextInt();
                        arr.get(i).setAge(age);
                        break;
                    case 4:
                        System.out.println("请输入学生地址：");
                        Scanner sc4 = new Scanner(System.in);
                        String address = sc4.nextLine();
                        arr.get(i).setLocal(address);
                        break;
                    default:
                        System.out.println("输入有误，请重新输入：");
                        continue;

                }
                System.out.println("修改成功！");
                return;
            }else {
                continue;
            }
        }
        System.out.println("查无此学号，请重新输入！");
    }
    public static void showStudents(ArrayList<Students> arr){
        if (arr.size() == 0){
            System.out.println("信息为空，请先添加再查询！");
            return;
        }
        System.out.println("学号    姓名    年龄    地址");
        for (int i=0;i<arr.size();i++){
            String name = arr.get(i).getName();
            int studentID = arr.get(i).getStudentID();
            int age = arr.get(i).getAge();
            String address = arr.get(i).getLocal();
            System.out.printf("%d\t\t%s\t\t%d\t\t%s",studentID,name,age,address);
            System.out.println();
        }
    }
    public static void level(){
        System.out.println("感谢你的使用，系统已退出！");
        System.exit(0);
    }
    public static void test(){
        System.out.println("hello world！");
        System.out.println("hello world！");

    }}
