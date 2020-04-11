package SDAcademy.SDA.HomeWorkApril05;

import java.util.Scanner;

public class ShowNumberOfSign {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = in.nextInt();
        char sign = '#';
        for (int i = 1; i <= num; i++) {
            System.out.println();
        }
    }
}
