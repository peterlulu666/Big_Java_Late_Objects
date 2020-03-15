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
        if (year % 4 != 0) {
            System.out.println("It is not a leap year. ");

        } else if (year % 100 != 0) {
            System.out.println("It is a leap year. ");

        } else if (year % 400 != 0) {
            System.out.println("It is not a leap year.");

        } else {
            System.out.println("It is a leap year. ");

        }
    }

    public boolean isLeapYear() {
        if (this.year % 4 == 0) {
            if (this.year % 100 == 0 && this.year % 400 != 0) {
                return false;

            } else {
                return true;

            }
        } else {
            return false;

        }
    }
}
