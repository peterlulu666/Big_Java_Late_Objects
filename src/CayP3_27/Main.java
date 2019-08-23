package CayP3_27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month: ");
        int month = scanner.nextInt();
        DaysInMonth daysInMonth = new DaysInMonth(month);
        daysInMonth.checkDays();

    }
}
