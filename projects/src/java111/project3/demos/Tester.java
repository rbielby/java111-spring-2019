/**
 * Program javadoc goes here.  Tell what the class is/does
 *
 * @author rjbielby
 */
public class Tester {

    public static void main(String[] args) {
        InputHelper helper = new InputHelper();
        String input = helper.getUserInput("Enter something whimsical here...");

        System.out.println("Is this what you entered?  " + input);

    }
}
