package SDAcademy.SDA.HomeWorkApril05;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number for checking the prime number");
        int num = in.nextInt();
        boolean prime = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                prime = true;
            }
        }
        if (!prime)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");
    }
}
