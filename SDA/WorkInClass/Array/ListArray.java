package SDAcademy.SDA.WorkInClass.Array;

public class ListArray {
    public static void main(String[] args) {
        int[] myArray = {5, 6, 7, 10, 13, 14};
        int length = myArray.length;
        int product = 1;
        int sum = 0;
        int max = myArray[0];
        System.out.println("The length of array is " + length);
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        System.out.println("Sum of number in array is " + sum);
        for (int i = 0; i < myArray.length; i++) {
            product *= myArray[i];
        }
        System.out.println("Product of number in array is " + product);
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max)
                max = myArray[i];
        }
        System.out.println("The highest number from array is " + max);
    }
}
