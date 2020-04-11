package SDAcademy.SDA.HomeWorkApril05;

import java.util.Scanner;

public class ShowNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number");
        int num = in.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println(i + " ");
        }
    }
}
