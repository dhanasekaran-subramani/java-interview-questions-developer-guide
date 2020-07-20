package com.ds2.tutorials;

public class Constructor {
    Constructor() {
        //TODO - Can you use this() and super() both in a constructor? - No, because this() and super() must be the first statement in the class constructor.
        super();
        //   this(); //
        System.out.println("Test class object is created");
    }

    public static void main(String[] args) {
        Constructor constructor = new Constructor();
    }
}
