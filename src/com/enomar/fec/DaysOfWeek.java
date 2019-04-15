package com.enomar.fec;

import com.company.TapeDeck;

import java.util.Scanner;

public class DaysOfWeek {
    /*
        using the string class and the switch statement
        i will create a Days Of The Week Converter
        From The Numbered Day To The actual Day Of The Week
    */

    public static void main(String[] args) {
        daysOfWeekConverter();
    }

    static void daysOfWeekConverter(){

        System.out.println("Enter only one number 1-7");
        System.out.println("Ill tell you the Week Day");
        System.out.println("And some days have games hidden in them");
        // Grabbing Input From User For Week Day Number
        int weekDay = new Scanner(System.in).nextInt();
        // utilizing switch statement to handle multiple outputs
        WordGame wg = new WordGame();
        TapeDeck t = new TapeDeck();
        switch(weekDay){
            case 1:{
                t.playTape();
                String m = "Monday";
                System.out.println(m);
                String mondaySecret = "mmmmmmmmmmmmmmmmmmmmmmmm";
                wg.playGame(mondaySecret);
                t.playTape();
            }
            break;
            case 2:{
                String tu = "Tuesday";
                System.out.println(tu);
                wg.playGame(tu);
            }
            break;
            case 3:{
                String w = "Wednesday";
                System.out.println(w);
                wg.playGame();
            }
            break;
            case 4:{
                String th = "Thursday";
                System.out.println(th);
                wg.playGame();
            }
            break;
            case 5:{
                String f = "Friday";
                System.out.println(f);
                wg.playGame();
            }
            break;
            case 6:{
                String sa = "Saturday";
                System.out.println(sa);
                wg.playGame();
            }
            break;
            case 7:{
                String su = "Sunday";
                System.out.println(su);
                wg.playGame();
            }
            break;
        }
    }

}
