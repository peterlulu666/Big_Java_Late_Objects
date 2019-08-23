package CayP3_28;

public class LeapYear {
    private int year;

    public LeapYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void checkLeapYear() {
        if (this.year % 100 == 0) {
            if (this.year % 400 == 0) {
                System.out.println("leap year");
            } else {
                System.out.println("It is not a leap year");
            }
        } else if (this.year % 4 == 0) {
            System.out.println("leap year");
        } else {
            System.out.println("It is not a leap year");
        }
    }
}
