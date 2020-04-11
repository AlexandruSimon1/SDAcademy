package SDAcademy.SDA.HomeWorkApril05;

import java.util.Scanner;

public class PerfectCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = in.nextInt();
        for (int i = 0; i <= num; i++) {
            if (Math.sqrt(i) == Math.sqrt(num))
                System.out.println("The perfect cube is " + i);
        }
    }
}
