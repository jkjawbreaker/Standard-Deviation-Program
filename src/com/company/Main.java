package com.company;

// ---------*---------*---------*---------*---------*
// The use of static imports is something that should be used carefully.
// I have only ever used this technique for the project wide constants.

import javax.swing.*;
import java.util.*;
import static com.company.ProjConstants.*;

public class Main {
    public static void main(String[] args) {
        boolean repeat = true;
        int[] numbers = new int[0];
        String fileName;
        System.out.println("What would you like to name the file your numbers are stored in");
        Scanner s1 = new Scanner(System.in), s2 = new Scanner(System.in);
        do {
            switch (s2.nextInt()) {
                case (): {

                }
                default:{
                    System.out.println("You need to enter positive number");
                }
            }
        }while (repeat) ;
    }
}
