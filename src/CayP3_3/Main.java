package CayP3_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        CountDigits countDigits = new CountDigits(number);
        countDigits.countDigit();


    }
}
