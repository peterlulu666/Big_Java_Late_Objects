package CayP3_15;

public class LargestNumber {
    private float numberOne;
    private float numberTwo;
    private float numberThree;

    public LargestNumber() {

    }


    public float checkLargestNumber(float numberOne, float numberTwo, float numberThree) {
        if (numberOne < numberTwo) {
            numberOne = numberTwo;
        }

        if (numberOne < numberThree) {
            numberOne = numberThree;
        }

        return numberOne;


    }


}
