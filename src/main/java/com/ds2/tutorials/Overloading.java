package com.ds2.tutorials;

//TODO Overloading - What is the output of th the below program??

/*
Because when figuring out which method to call,
the compiler picks the most specific method it can find that matches the argument.
Both fun(String) and fun(Object) match a call to fun(null),
but fun(String) is more specific than fun(Object),
so the compiler uses that.
When you uncomment the fun(Integer) version, though,
the compiler can't make a choice because both fun(String) and fun(Integer) are equally specific.
 */

public class Overloading {
    public static void main(String[] args) {
        fun(null);
    }

    static void fun(Object o) {
        System.out.println("Object");
    }

    static void fun(String s) {
        System.out.println("String");
    }

    static void fun(int s) {
        System.out.println("Integer");
    }

    /*static void fun(Integer s) {
        System.out.println("Integer");
    }*/
}
