/*
* Print first numbers of Fibonacci until it passes 100. The first element is 0
*/

public class FibonacciFirstNumbers {
    public static void main(String[] args) {
        int previous = 0;
        int actualNumber = 1;

        while(actualNumber < 100) {
            System.out.println(actualNumber);

            int nextNumber = previous + actualNumber;
            previous = actualNumber;
            actualNumber = nextNumber;
        }
        System.out.println(actualNumber);
    }
}
