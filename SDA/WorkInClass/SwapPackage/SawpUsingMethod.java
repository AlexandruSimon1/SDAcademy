package SDAcademy.SDA.WorkInClass.SwapPackage;

import java.util.Scanner;

public class SawpUsingMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Set a");
        int a = in.nextInt();
        System.out.println("Set b");
        int b = in.nextInt();

        swap(a, b);
    }

    static void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.println("a = " + a + " b = " + b + " c = " + c);
    }
}
