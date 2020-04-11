package SDAcademy.SDA.HomeWorkApril05;

import java.util.Scanner;

public class MaximNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1 = in.nextInt();
        System.out.println("Please enter second number");
        int num2 = in.nextInt();
        if (num1 > num2) {
            System.out.println("Maximum number is first number " + num1);
        } else {
            System.out.println("Maximum number is second number " + num2);
        }
    }
}
