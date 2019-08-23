package CayP3_2;

public class ABSCheckNumber {
    private float number;

    public ABSCheckNumber() {

    }

    public ABSCheckNumber(float number) {
        this.number = number;
    }

    public String checkNumber() {
        if (this.number < 0) {
            return "negative";
        } else if (this.number == 0) {
            return "zero";
        } else {
            return "positive";
        }

    }

    public String checkABS() {
        if (Math.abs(this.number) < 1) {
            return "small";
        } else if (Math.abs(this.number) > 1_000_000) {
            return "large";
        } else {
            return "";
        }
    }

    public void printNumber() {
        if (checkNumber().equals("zero")) {
            System.out.println("zero");
        }

        if (checkNumber().equals("positive")) {
            if (checkABS().equals("small")) {
                System.out.println("positive small");
                return;
            }

            if (checkABS().equals("large")) {
                System.out.println("positive large");
                return;
            }
            System.out.println("positive");
        } else if (checkNumber().equals("negative")) {
            if (checkABS().equals("small")) {
                System.out.println("negative small");
                return;
            }

            if (checkABS().equals("large")) {
                System.out.println("negative large");
                return;
            }
            System.out.println("negative");

        }
    }
}


