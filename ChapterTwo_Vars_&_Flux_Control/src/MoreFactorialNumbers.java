/*
* Like the class 'FactorialNumbers'
* Increment the amount of numbers printed until 20, 30 and 40.
* Change int to long
* */

public class MoreFactorialNumbers {
    public static void main(String[] args) {
        long factor = 1;

        for(int n = 1; n <= 40; n++){
            factor = factor * n;
            System.out.println("factorial number(" + n + ") = " + factor);
        }
    }
}
