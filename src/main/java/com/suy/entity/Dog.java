package com.suy.entity;

import sun.applet.Main;

/**
 * @author suy
 * @create 2022-05-13 23:37
 */
public class Dog {
    public static void main(String[] args) {
        System.out.println("hello");
        int i = 1;
        System.out.println("i = " + i);
        String[] strings = {"1", "2", "3"};
        for (int j = 0; j < strings.length; j++) {
            System.out.println(strings[i]);

        }
        for (String string : strings) {
            System.out.println(string);
        }

        if (strings == null) {

        }
        if (strings != null) {

        }
    }
}
