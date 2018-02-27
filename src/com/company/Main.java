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
        do {
            s1 = new Scanner(System.in);
            if(s1.hasNextInt()){
                enterInt=s1.nextInt();
                maxarray=maxarray+1;
                numbers[counter]=enterInt;
                System.out.println(enterInt);
            }else if (s1.nextLine()=="done"){
                for(int a=0;a<counter;a++){
                    System.out.print(numbers[counter]);
                }
            }
            else {
                System.out.println(counter);
            }
            counter=counter+1;
        }while (repeat) ;
    }
}
