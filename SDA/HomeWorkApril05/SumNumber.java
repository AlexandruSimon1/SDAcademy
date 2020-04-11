package SDAcademy.SDA.HomeWorkApril05;

import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number for sum of all numbers");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of all number is " + sum);
    }
}
