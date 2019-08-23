package CayP3_04_05_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose strict or lenient");
        String choose = scanner.nextLine();
        System.out.println("Enter the first number: ");
        int numberOne = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int numberTwo = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int numberThree = scanner.nextInt();
        CompareNumber compareNumber = new CompareNumber(numberOne, numberTwo, numberThree);
//        compareNumber.compareThreeNumber();
//        compareNumber.checkNumberOrderStrict();


//        System.out.println("Choose strict or lenient");
//        String choose = scanner.nextLine();

        System.out.printf("%s mode\n", choose);
        if (choose.equals("strict")) {
            compareNumber.checkNumberOrderStrict();
        }

        if (choose.equals("lenient")) {
            compareNumber.checkNumberOrderLenient();
        }




    }
}
