package SDAcademy.SDA.HomeWorkApril04;

import java.util.Scanner;

public class Mathematic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter first number for calculation");
        int num1 = in.nextInt();
        System.out.println("Please enter second number for calculation");
        int num2 = in.nextInt();
        int sum = sum(num1, num2);
        int difference = difference(num1, num2);
        int multiply = multiply(num1, num2);
        double divide = divide(num1, num2);
        System.out.println("Result of sum of the numbers is " + sum);
        System.out.println("Result of difference between the numbers is " + difference);
        System.out.println("Result of multiply of the numbers is " + multiply);
        System.out.println("Result of divide of the number is " + divide);
    }

    static int sum(int num1, int num2) {
        return num1 + num2;
    }

    static int difference(int num1, int num2) {
        return num1 - num2;
    }

    static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    static double divide(double num1, double num2) {
        return num1 / num2;
    }
}
