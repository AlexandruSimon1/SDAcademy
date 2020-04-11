package SDAcademy.SDA.HomeWorkApril04;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert the width for rectangle");
        double width = in.nextDouble();
        System.out.println("Please insert the height for rectangle");
        double height = in.nextDouble();
        double area = width * height;
        double perimeter = 2 * (width + height);
        System.out.println("Area is " + area);
        System.out.println("Perimeter is " + perimeter);
    }
}
