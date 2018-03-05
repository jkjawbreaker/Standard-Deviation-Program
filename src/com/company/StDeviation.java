package com.company;

// ---------*---------*---------*---------*
// The use of static imports is something that should be used carefully.
// I have only ever used this technique for the project wide constants.
//
import jdk.management.resource.internal.inst.DatagramDispatcherRMHooks;

import static com.company.ProjConstants.*;

/**
 * Created by Robert Hubert on 21/02/2018.
 */
public class StDeviation {


    // ---------*---------*---------*---------*---------*---------*---------*---------*
    // As discussed in class we are using a class populated with Project Constants to
    // ensure help manage the project data. This ensures that each class can access the
    // constant values, but in the event that a change is needed/required that this will
    // only need to be made in one location, or file.
    //
    // Notice: If I had not done the "static import com.company.ProjConstants.*;" then
    //         the use of the constant would have been written as:
    //
    //         private int[] Data = new int[ProjConstants.MAXDATA];
    //
    //private int[] Data = new int[MAXDATA];
    private int[] Data = {1,2,3,4,5};
    int position =0,amount=0;
    // ---------*---------*---------*---------*---------*---------*---------*---------*
    // The following method will take a new data item and add it into the 1 Dimensional
    // Array of data values to be used later.
    //
    // You MUST write this method and I will use it during testing
    //
    public void addNewDataItem(int dataItem){

        Data[position]= dataItem;
        position=position+1;

    }

    // ---------*---------*---------*---------*---------*---------*---------*---------*
    // The following method will return the total number of data items currently stored
    //
    // You MUST write this method and I will use it during testing
    //
    public int getNumberOfDataItems(){
        // temporary value
        amount =Data.length;
        return amount;
    }

    // ---------*---------*---------*---------*---------*---------*---------*---------*
    // The following method returns a double precision value which is the average of all
    // of the data values
    //
    // You MUST write this method and I will use it during testing
    //
    public double calcAverage(){
        double sum=0;
        for(int a=0;a<amount;a++){

            sum=sum+Data[a];

        }
        double average= sum/amount;
        return sum;
    }

    // ---------*---------*---------*---------*---------*---------*---------*---------*
    // The following method returns a double precision value which is the Variance of all
    // of the data values
    //
    // You MUST write this method and I will use it during testing
    //
    public double calcVariance(){

        // temporary value
        return INVALID;
    }


    // ---------*---------*---------*---------*---------*---------*---------*---------*
    // The following method returns a double precision value which is the Standard
    // Deviation of all of the data values
    //
    // You MUST write this method and I will use it during testing
    //
    public double calcStandardDeviation(){

        // temporary value
        return INVALID;
    }

}
package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] a = {1,2,3,4,5};
        double amount = a.length;
        double sum=0;
        for(int i=0;i<amount;i++){
            sum = sum+a[i];
        }
        System.out.print(sum);
    }
}
