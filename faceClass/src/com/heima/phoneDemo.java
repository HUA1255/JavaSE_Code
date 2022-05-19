package com.heima;

public class phoneDemo {
    public static void main(String[] args) {
        phone p = new phone();
        System.out.println(p.price);
        p.band ="xiaomi";
        p.price = 2999;
        p.call();
        p.sendMessage();
        System.out.println(p.price);
        System.out.println(p.band);
    }
}
