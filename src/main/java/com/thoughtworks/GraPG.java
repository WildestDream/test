package com.thoughtworks;

import java.util.Arrays;
import java.util.List;

public class GraPG {

    public static void main(String[] args) {

        System.out.println("I am coming, believe myself");

        List<String> list = Arrays.asList("1", "2", "3");

        Runnable r = () ->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("run!");
        };

        Thread t = new Thread(r);
        t.start();

        long res = System.currentTimeMillis();
        System.out.println("time:"+res);

    }



    String print() {
        return "hello world";
    }
}
