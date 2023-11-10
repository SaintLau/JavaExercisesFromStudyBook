/*
* Print factorial numbers from 1 to 10.
* A factorial of a number n is n*(n-1), n*(n-2), and so on
*
* */

public class FactorialNumbers {
    public static void main(String[] args) {
        int factor = 1;

        for(int n = 1; n <= 10; n++){
            factor = factor * n;
            System.out.println("factorial number(" + n + ") = " + factor);
        }
    }
}
