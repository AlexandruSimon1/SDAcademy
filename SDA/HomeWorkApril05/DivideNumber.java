package SDAcademy.SDA.HomeWorkApril05;

import java.util.Scanner;

public class DivideNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to be divided on 5");
        int num = in.nextInt();
        for (int i = 0; i <= num; i++) {
            if (i % 5 == 0)
                System.out.println(i + " ");
        }
    }
}
