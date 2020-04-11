package SDAcademy.SDA.HomeWorkApril05;

import java.util.Scanner;

public class BigestDivider {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1 = in.nextInt();
        System.out.println("Please enter second number");
        int num2 = in.nextInt();
        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0)
                gcd = i;
        }
        System.out.println("Greatest Common Divisor is " + gcd);
    }
}
