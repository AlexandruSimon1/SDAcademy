package SDAcademy.SDA.WorkInClass.DogPackage;

import java.util.Scanner;

public class Dog {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DogNew dog = new DogNew();
        System.out.println("Set dog breed");
        dog.breed = in.nextLine();
        System.out.println("Set dog weight");
        dog.weight = in.nextLine();
        System.out.println("Set dog age");
        dog.age = in.nextInt();
        System.out.println("Dog breed is " + dog.breed + " weight is " + dog.weight + " kg " + " and age is " + dog.age + " years");
    }
}
