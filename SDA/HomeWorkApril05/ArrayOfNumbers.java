package SDAcademy.SDA.HomeWorkApril05;

import java.util.Scanner;

public class ArrayOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = a; i <= b; i++) {
            System.out.println("The interval between numbers is");
            System.out.println(i);
        }
    }
}
