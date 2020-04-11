package SDAcademy.SDA.HomeWorkApril05;

import java.util.Scanner;

public class RestOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number that need to be devided");
        int num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0)
                System.out.print(" 1 ");
            else
                System.out.print(" 0 ");
        }
    }
}
