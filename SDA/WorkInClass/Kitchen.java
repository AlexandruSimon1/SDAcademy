package SDAcademy.SDA.WorkInClass;

import java.util.Scanner;

public class Kitchen {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Set first value");
        int primulNumar = in.nextInt();
        System.out.println("Set second value");
        int alDoileaNumar = in.nextInt();
        adunare(primulNumar, alDoileaNumar);
        int sum = sum(primulNumar,alDoileaNumar);
        System.out.println(sum);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void adunare(int a, int b) {
        System.out.println(a + b);
    }
}
