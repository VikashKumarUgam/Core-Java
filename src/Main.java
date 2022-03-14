import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a suitably named package containing a class called Series with the following static methods:
        // nSum(int n) returns the sum of all numbers from 0 to n. The first 10 numbers are:
        //0 1 3 6 10 15 21 28 36 45 55
        // factorial(int n) returns the product of all the numbers from 1 to n
        // The first 10 factorials are:
        // 0 1 2 6 24 120 720 5040 40320 362880 3628800
        // fibonacci(n) returns the nth Fibonacci number. These are defined as:
        // f(0) =0 f(1)=1 f(2)=1 f(3)=2

        for(int i=0; i <=10; i++) {
            System.out.println(Series.nSum(i));
        }

        System.out.println("*****************************");
        for(int i=0; i<=10; i++) {
            System.out.println(Series.factorial(i));
        }
        System.out.println("*****************************");
        for(int i=0; i<=10; i++) {
            System.out.println(Series.fibonacci(i));
        }


        // Write a small program to read an integer from the keyboard
        // (using Scanner) and print out the times table for that number.
        // The table should run from 1 to 12.
        //
        // You are allowed to use one variable called scanner for your
        // Scanner instance. You can use as many other variables as you
        // need, but they must must all be called x. That includes any
        // class instances and loop control variables that you may decide
        // to use.
        //
        // If you use a class, the class can be called X (capital), but
        // any instances of it must be called x (lower case).
        //
        // Any methods you create must also be called x.
        //
        // Optional Extra:
        // Change your program so that ALL variables (including the scanner
        // instance) are called x.

        X x = new X(new Scanner(System.in));
        x.x();
    }
}
