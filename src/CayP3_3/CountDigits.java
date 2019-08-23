package CayP3_3;

public class CountDigits {
    private int number;

    public CountDigits() {

    }

    public CountDigits(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void countDigit() {
        int digit = 0;
        if (this.number < 0) {
            this.number = this.number * -1;
        }

        if (this.number < 10) {
//            System.out.println("one digit");
            digit = 1;
//            return;
        } else if (this.number < 100) {
//            System.out.println("two digit");
//            return;
            digit = 2;
        } else if (this.number < 1000) {
//            System.out.println("three digit");
//            return;
            digit = 3;
        } else if (this.number < 10000) {
//            System.out.println("four digit");
//            return;
            digit = 4;
        } else if (this.number < 100000) {
//            System.out.println("five digit");
//            return;
            digit = 5;
        } else if (this.number < 1000000) {
//            System.out.println("six digit");
//            return;
            digit = 6;
        } else if (this.number < 10_000_000) {
//            System.out.println("seven digit");
//            return;
            digit = 7;
        } else if (this.number < 100_000_000) {
//            System.out.println("eight digit");
//            return;
            digit = 8;
        } else if (this.number < 1_000_000_000) {
//            System.out.println("nine digit");
//            return;
            digit = 9;
        } else if (this.number > 1_000_000_000) {
            System.out.println("Enter a number less than 10 billion");
            return;
        }

        System.out.printf("The number has %d digits", digit);
    }
}
