package com.ds2.tutorials;

//TODO (Java) 1.  Ternary operator with Integer wrapper class, == returns true if and only if both variables refer to the same object, if their references are one and the same.

public class Ternary {
    public static void main(String[] args) {
        Integer x = 1987;
        Integer y = 1987;

        int a = 1987;
        int b = 1987;

        System.out.println(x == y ? "A" : "B"); // return B
        System.out.println(a == b ? "A" : "B"); // return A
    }

//TODO (Java) 2. Ternary operators can't have statements that don't return values, void methods. You need statements that have return values.

    // This block will not work - Ternary operators can't have statements that don't return values, void methods. You need statements that have return values.

    //void bark(boolean hamlet) {
    //    hamlet ? System.out.println("To Bark.") : System.out.println("Not to Bark");
    //}

    //th below block will work
    void bark(boolean hamlet) {
        System.out.println(hamlet ? "To Bark." : "Not to Bark");
    }

}