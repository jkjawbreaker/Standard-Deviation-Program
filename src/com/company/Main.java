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
        int enterInt,counter=0,maxarray=1;
        int numbers[]=new int[maxarray];
        String fileName;
        System.out.println("What would you like to name the file your numbers are stored in");
        Scanner s1 = new Scanner(System.in), s2 = new Scanner(System.in);
        fileName=s1.nextLine();
        System.out.println("Enter number");
        do {
            s2 = new Scanner(System.in);
            if(s2.hasNextInt()){
                enterInt=s2.nextInt();
                maxarray=maxarray+1;
                numbers[counter]=enterInt;
                System.out.println(enterInt);
                System.out.println("Enter number");
            }else if (s2.nextLine()=="done"){
                for(int a=0;a<counter;a++){
                    System.out.print(numbers[counter]);
                }
            }
            else {
                System.out.println("You must enter a number");
                System.out.println("Enter number");
            }
            counter=counter+1;
        }while (repeat) ;
    }
}
