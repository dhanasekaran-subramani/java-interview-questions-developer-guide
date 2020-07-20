package com.ds2.tutorials;

//TODO - Remove Or Removing All The Whitespaces ( Blank Spaces) In The String

public class SqueezeString {
    static int i;

    static void squeeze(String s) {
        for (i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ')
                System.out.print(ch);
        }
    }


    public static void main(String args[]) {

        System.out.println("Original String is : ");
        System.out.println("   manchester united is also known as red devil   ");
        SqueezeString.squeeze("   manchester united is also known as red devil    ");

        // removing white spaces from string using replace all

        System.out.println("Hello World".replaceAll("\\s",""));

    }
}