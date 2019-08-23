package CayP3_01;

public class CheckNumber {
    private int number;

    public CheckNumber() {

    }

    public CheckNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void printNumber() {
        if (this.number < 0) {
            System.out.println("negative");
        } else if (this.number == 0) {
            System.out.println("zero");
        } else {
            System.out.println("positive");
        }

    }
}
