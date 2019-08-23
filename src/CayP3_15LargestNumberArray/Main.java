package CayP3_15LargestNumberArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int size = 3;
        float[] numberArray = new float[size];
        int count = 0;
        int indexArray = 0;
        while (count < size) {
            System.out.println("Enter a number: ");
            float number = scanner.nextFloat();
            numberArray[indexArray] = number;
            count++;
            indexArray++;
        }
//        System.out.println("Enter a number: ");
//        float numberOne = scanner.nextFloat();
//        System.out.println("Enter a number: ");
//        float numberTwo = scanner.nextFloat();
//        System.out.println("Enter a number: ");
//        float numberThree = scanner.nextFloat();
//        numberArray[1] = numberOne;
//        numberArray[2] = numberTwo;
//        numberArray[3] = numberThree;

//        for (int number = 1; number < numberArray.length; number++) {
//            if (numberArray[0] < numberArray[number]) {
//                numberArray[0] = numberArray[number];
//            }
//        }


        Arrays.sort(numberArray);

        System.out.printf("The largest number is: %.1f", numberArray[numberArray.length - 1]);

    }
}
