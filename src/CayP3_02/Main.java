package CayP3_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        float number = scanner.nextFloat();
        ABSCheckNumber absCheckNumber = new ABSCheckNumber(number);
        absCheckNumber.printNumber();

    }
}
