package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Reading from System.in

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number: 0 - 10  ");

        int feet = reader.nextInt(); // Scans the next token of the input as an int.
        //once finished
        reader.close();
        if(feet <= 10){
            System.out.println("You have  "+ feet +" feet   & " +"  Or   "+ (feet * 12) + "   inches");
        }
    }
}
