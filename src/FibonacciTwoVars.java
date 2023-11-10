/*
*
* Print the Fibonacci sequence using only two vars
*
* */

public class FibonacciTwoVars {
    public static void main(String[] args) {
        int previousNumber = 0;
        int actualNumber = 1;

        while(actualNumber < 100) {
            System.out.println(actualNumber);
            actualNumber = previousNumber + actualNumber;
            previousNumber = actualNumber - previousNumber;
        }
        System.out.println(actualNumber);
    }
}
