package dataStructures.Arrays;

import java.util.Scanner;

public class Main {
    // getting from the user
    private  static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int [] myIntVariable = new int [20];
        printArray(myIntVariable);


        /*for (int i = 0; i < myIntVariable.length ; i++) {
            myIntVariable[i] = i*10;
            //System.out.println(myIntVariable[i]);
        } // end for

        for (int i = 0; i <myIntVariable.length ; i++) {
            System.out.println("Element " + i + ", value is " + myIntVariable[i]);

        } // end last for */


        // creating a array with 5 values, getting from this value from getInteger method
        int [] myIntegersArray= getIntegers (5);
        for (int i = 0; i < myIntegersArray.length; i++) {
            System.out.println("Element "+ i + "typed value was" + myIntegersArray[i] );

        }
        System.out.println("The average is " + getAverage(myIntegersArray));

    } // end main method

    // method to get integers

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + "Integer values.\r");
        // defining array ; and passing the numbers that we we get
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            // saving numbers from the console into the array
            values[i] = scanner.nextInt();
        }
        return values;

    } // end getIntegers

    // getting average
    public static double getAverage(int [] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double)array.length;

    } // end getaverge



    // method  print array
    public static void printArray (int [] myIntVariable){
        for (int i = 0; i < myIntVariable.length ; i++) {
            myIntVariable[i] = i;
            System.out.println(myIntVariable[i]);
        } // end for




    }


}
