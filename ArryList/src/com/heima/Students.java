package com.heima;

public class Students {
    private int studentID;
    private String name;
    private int age;
    private String local;

    public Students(int studentID, String name, int age, String local) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.local = local;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
