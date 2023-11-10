/*
* Print the following table using for
*
* 1
* 2 4
* 3 6 9
* 4 8 12 16
*
* n n*2 n*3...n*n
*
* */

public class PrintTable {
    public static void main(String[] args) {
        int num = 5;

        for (int row = 1; row <= num; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(row * column + " ");
            }
            System.out.println();
        }
    }
}
