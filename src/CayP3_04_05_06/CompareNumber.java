package CayP3_04_05_06;

public class CompareNumber {
    private int numberOne;
    private int numberTwo;
    private int numberThree;

    public CompareNumber() {

    }

    public CompareNumber(int numberOne, int numberTwo, int numberThree) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.numberThree = numberThree;
    }

    public int getNumberOne() {
        return numberOne;
    }

    public void compareThreeNumber() {
        if (this.numberOne == this.numberTwo && this.numberOne == this.numberThree && this.numberTwo == this.numberThree) {
            System.out.println("all the same");
            return;
        } else if (this.numberOne != this.numberTwo && this.numberOne != this.numberThree && this.numberTwo != this.numberThree) {
            System.out.println("all different");
            return;
        } else {
            System.out.println("neither");
            return;
        }

    }

    public void checkNumberOrderStrict() {
        if (this.numberOne < this.numberTwo && this.numberTwo < this.numberThree) {
            System.out.println("increasing");
            return;
        } else if (this.numberOne > this.numberTwo && this.numberTwo > this.numberThree) {
            System.out.println("decreasing");
            return;
        } else {
            System.out.println("neither");
            return;
        }

    }

    public void checkNumberOrderLenient() {
        if ((this.numberOne <= this.numberTwo && this.numberTwo < this.numberThree) || (this.numberOne < this.numberTwo && this.numberTwo <= this.numberThree)) {
            System.out.println("increasing");
            return;
        } else if ((this.numberOne >= this.numberTwo && this.numberTwo > this.numberThree) || (this.numberOne > this.numberTwo && this.numberTwo >= this.numberThree)) {
            System.out.println("decreasing");
            return;
        } else if (this.numberOne == this.numberTwo && this.numberTwo == this.numberThree) {
            System.out.println("both increasing and decreasing");
            return;
        } else {
            System.out.println("neither");
        }
    }
}
