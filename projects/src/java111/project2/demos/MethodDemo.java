/**
 * Class that demonstrates methods parameters and return values
 *
 * @author rjbielby
 */
public class MethodDemo {
    int numberOne = 2;
    int numberTwo = 3;

    /**
     * This method calculates a number from two other numbers
     *
     */
    public int calculateThree(int intParameterOne, int intParameterTwo) {
        int product = intParameterTwo * intParameterOne;
        return product;
    }


    /**
     * This method calculates a number from two other numbers
     *
     */
    public void calculateTwo(int intParameter) {

        System.out.println("calculateTwo");
        int product = numberOne * intParameter;
        System.out.println(product);
    }



    /**
     * This method calculates a number from two other numbers
     *
     */
    public void calculate() {

        System.out.println("calculate");
        int product = numberOne * numberTwo;
        System.out.println(product);
    }

}
