package com.enomar.fec;

public class AccessModifiers {

    public static void main(String[] args) {
        // Calling All Methods
        saySomethingNice();
        secretWord();
        DefaultExample obj = new DefaultExample();
        obj.display();

    }


    static void saySomethingNice(){
        String ramone = "hello mike";
        System.out.println(ramone);

    }

    static void secretWord(){
        String arcade = "Hello Game";
        String a = arcade.substring(4,8);
        String b = arcade.substring(7);
        String c = b + arcade + a;
        System.out.println(c);
    }


}
