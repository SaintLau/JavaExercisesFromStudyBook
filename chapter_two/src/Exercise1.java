
/*
In a company, there are tables with monthly expenses.
To close the quarter, we need to ADD te total expenses.
In January it was 15000€, in February 23000€ and in March 17000€.

Run a program that can calculate and print the total expenses and the average expenses

 */

public class Exercise1 {
    public static void main(String[] args) {

        // int vars to save amunt values
        int jan = 15000;
        int feb = 23000;
        int mar = 17000;

        // calc total
        int total = jan + feb + mar;

        // cal average
        int average = total / 3;

        // print results
        System.out.println("The quarter total is " + total);
        System.out.println("The average is " + average);
    }
}