package com.enomar.fec;

import java.util.Scanner;

public class StringConCat {
    public static void main(String[] args){
        System.out.println("Enter the word you want to Change");
        String userInput = new Scanner(System.in).next();
        String name = "skadoosh";
        String newWord = userInput.concat(name.substring(0,3));
        String bread = name.substring(3);
        System.out.println(bread + newWord);

    }
}
