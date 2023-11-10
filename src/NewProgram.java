/*
* Write a new program that with a given variable x, with an int value,
* we have a new x according the rules:
*
* if x is even x = x / 2;
* if x is odd x = 3 * x + 1
* print x
*
* Program must stop when x has the final value of 1. Ex: for x=13 it prints:
* 40 - 20 - 10 - 5 - 16 - 8 - 4 - 2 - 1
*
* PRINT THE RESULT WITH SKIP THE LINE
*
* */

public class NewProgram {
    public static void main (String[] args) {
        int x = 13;

        System.out.println(("Start...\n" + x));

        while(x != 1) { // while x has a different value from 1
            if(x % 2 == 0) { // if even number
                x = x / 2;
            } else { // if odd number
                x = 3 + x + 1;
            }
            System.out.print(x);
        }
    }
}
