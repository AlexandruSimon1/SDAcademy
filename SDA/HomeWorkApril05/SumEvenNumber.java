package SDAcademy.SDA.HomeWorkApril05;

import java.util.Scanner;

public class SumEvenNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number for sum");
        int num = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0)
            sum = sum +i;
        }
        System.out.println("Sum of even number from the array is " + sum);
    }
}
