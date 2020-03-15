package CayP3_28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        LeapYear leapYear = new LeapYear(year);
        leapYear.checkLeapYear();
        System.out.println(leapYear.isLeapYear());


    }
}
