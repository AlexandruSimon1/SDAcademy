package SDAcademy.SDA.HomeWorkApril04;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter radius of the circle");
        double radius = in.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
