package dataStructures.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ChallengeArray {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         *Create a program using arrays that sorts a list of integers in descending order
         * Descending order is highest value to lowest
         *Set up the program so the numbers to sort are read in from the keyboard
         * Implement the following methods - GetInteger , PrintArray , and sortIntegers
         * getIntegers return an array of entered integers from keyboard
         * PrintArray prints out the contents of the array
         * sortIntegers should sort the array and return a new array containing the sorted number
         * you will have to figure out how to copy the array elements from the passed array into a new array and sort them and return the new sorted array
         * */

        // getting array values from the console, saving it into a array and outputting it
        int [] myIntegerArray = getIntegers(3);
        int [] sorted = sortIntegers(myIntegerArray);
        printArray(sorted);



    } // end main method
    /*
    * GetInteger :return an array of entered integers from keyboard : done
    * */

    public static int [] getIntegers (int number){
        // creating the array
        System.out.println("Enter :" + number + " Integer values.\r");
        int array [] = new int[number];
        // looping through the value the user inputed
        for (int i = 0; i < array.length; i++) {
            // saving the value from the user ,scanner into the array into next index
            array[i] = scanner.nextInt();
        }
        return array;
    } // end getIntegers



    /* PrintArray :  prints out the contents of the array : done
    * */

    public static void printArray ( int [] myIntegerArray){
        for (int i = 0; i < myIntegerArray.length; i++) {
            //myIntegerArray[i] = i;
            System.out.println("Value entered index:"+" " + i + " is : " + myIntegerArray[i]);
        }
    } // end print array

    /*
    * sortIntegers : should sort the array and return a new array containing the sorted number
    * */

    public static int [] sortIntegers (int [] myIntegerArray) {
        int [] sortedArray = new int[myIntegerArray.length];
        for (int i = 0; i < myIntegerArray.length; i++) {
            // copying the array to sorted array
            sortedArray[i] = myIntegerArray[i];
        } // end outer Lopp
        // we can use built in methods to copy of the array
        int [] sortedArray2 = Arrays.copyOf(myIntegerArray, myIntegerArray.length);


        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i+1]){
                    // swapping elements
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i +1];
                    sortedArray[i+1] = temp;
                    flag = true;

                }// end if sort
            }
        } // end while
        return sortedArray;

    } // end sortIntegers

}
