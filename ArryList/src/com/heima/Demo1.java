package com.heima;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("123");
        arr.add("456");
        System.out.println(arr);
        arr.add(1,"xx");
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
        arr.set(1,"xx");
        System.out.println(arr.get(1));
        System.out.println(arr);
        System.out.println(arr.size());

    }
}
