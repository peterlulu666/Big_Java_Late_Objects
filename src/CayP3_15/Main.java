package CayP3_15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        float numberOne = scanner.nextFloat();
        System.out.println("Enter a number");
        float numberTwo = scanner.nextFloat();
        System.out.println("Enter a number");
        float numberThree = scanner.nextFloat();

        LargestNumber largestNumber = new LargestNumber();

        System.out.println(largestNumber.checkLargestNumber(numberOne, numberTwo, numberThree));


    }
}
