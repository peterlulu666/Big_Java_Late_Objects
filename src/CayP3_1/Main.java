package CayP3_1;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        CheckNumber checkNumber = new CheckNumber(number);
        checkNumber.printNumber();


    }
}
