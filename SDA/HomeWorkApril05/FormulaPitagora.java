package SDAcademy.SDA.HomeWorkApril05;

import java.util.Scanner;

public class FormulaPitagora {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number for verification formula of Pitagora");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
            System.out.println("The numbers respect Formula of Pitagora");
        else
            System.out.println("Numbers doesn't respect Formula of Pitagora");
    }
}
