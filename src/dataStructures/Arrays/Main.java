package dataStructures.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] myIntVariable = new int [10];

        for (int i = 0; i < myIntVariable.length ; i++) {
            myIntVariable[i] = i*10;
            //System.out.println(myIntVariable[i]);
        }
        for (int i = 0; i <myIntVariable.length ; i++) {
            System.out.println("Element " + i + ", value is " + myIntVariable[i]);

        }


    }
}
