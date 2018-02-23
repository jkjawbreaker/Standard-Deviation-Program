package com.company;

// ---------*---------*---------*---------*---------*
// The use of static imports is something that should be used carefully.
// I have only ever used this technique for the project wide constants.
//
import javax.swing.*;

import static com.company.ProjConstants.*;

public class Main {



    public static void main(String[] args) {
        // ---------*---------*---------*---------*---------*
        // Create a new object from the StDeviation Class
        StDeviation calcSDev =  new StDeviation();
        JFrame Ask=new JFrame("Standard Deviation Program");
        JFrame Answer=new JFrame("Standard Deviation Program");
        JTextField textField=new JTextField("");
        JPanel panel= new JPanel();
        Ask.setVisible(true);
        Ask.setSize(300,300);
        panel.setSize(100,100);
        Ask.setLocationRelativeTo(null);
        Ask.add(panel);
        textField.setSize(100,100);
        panel.add(textField);
    }
}
