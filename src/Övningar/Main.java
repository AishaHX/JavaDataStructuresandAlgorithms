package Övningar;

public class Main {
    public static void main(String[] args) {
        int num = 9;


        //factorial(3);

        int fac= factorial(num);

        //System.out.println("factorial of " + num + " is "+ " = " + fac);
        int fib = fibonacci((num));
        System.out.println( "fibonacci of "+ num +" is " + "= " + fib);




    }

    public static int factorial(int num){
        num = 8;
        if (num <= 1){

            return num * factorial(num -1 );



        }else {
            return 1;
        } // end if

    }//end factorial

    /**
     *  Algorithm
     *
     * # fibonacci.rb
     * def fibonacci(number)
     *   if number < 2
     *     number
     *   else
     *     fibonacci(number - 1) + fibonacci(number - 2)
     *   end
     * end
     *
     * */

    // fibonacci


    public static int fibonacci (int num){
        if (num <= 1){
            return num;

        }else {
            return fibonacci(num-1) + fibonacci(num-2);
        }


    }

}

