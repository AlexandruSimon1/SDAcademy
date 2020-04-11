package SDAcademy.SDA.HomeWorkApril05;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number for checking all even numbers");
        int num = in.nextInt();
        for (int i = 0; i < num; i++)
            if (i % 2 == 0)
                System.out.println(i + " ");
    }
}
