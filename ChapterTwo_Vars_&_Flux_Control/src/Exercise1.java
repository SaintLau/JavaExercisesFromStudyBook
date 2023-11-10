/*
*
*  Numa empresa, há tabelas com gastos de cada mês.
*  Para fechar o balaço do primeiro trimestre, precisamos de SOMAR o GASTO TOTAL.
*  Em janeiro gastaram 15 mil €, em fevereiro  23 mil € e em março 17 mil €.
*  Faz um programa que calcule e imprima a DESPESA TOTAL NO TRIMESTRE e a MÉDIA MENSAL DE GASTOS
*
* */

public class Exercise1 {
    public static void main(String[] args) {

        // declare vars to assume the values for each mont
        int jan = 15000;
        int feb = 23000;
        int mar = 17000;

        // calc total
        int total = jan + feb + mar;

        // calc average
        int average = total / 3;

        System.out.println("The total for the quarter is " + total);

        System.out.println("The quarter average is " + average);
    }
}