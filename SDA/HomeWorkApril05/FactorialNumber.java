package SDAcademy.SDA.HomeWorkApril05;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number for factorial calculation");
        int n = in.nextInt();
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        System.out.println("Sum of factorial number is " + sum);
    }
}
