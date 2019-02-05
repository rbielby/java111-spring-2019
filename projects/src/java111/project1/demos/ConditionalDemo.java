/**
 * Demonstrating if/else statements and booleans
 *
 * @author rjbielby
 */
public class ConditionalDemo {

    /**
     * create a variable and then use if/else checks
     * to perform displays of messages
     */
    public static void main(String[] args) {

        int myNumber = 50;

        if (myNumber == 50) {
            System.out.println("The number is 50... " + myNumber);
        } else if (myNumber == 30) {
            System.out.println("The number is 30.. " + myNumber);
        } else {
            System.out.println("The number not 30 or 50. It is " + myNumber);
        }
    }

}
