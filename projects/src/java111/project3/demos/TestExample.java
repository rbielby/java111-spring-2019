/**
 * Automated unit tests for the CompareGame class. This class will test
 * a correct guess and a that a random number is generated in the proper range.
 * @author    me
 */
public class TestExample {

    /**
     *  1. Instantiate the class to be tested
	 *  2. Set any data on the class to be tested
	 *  3. Create a variable for the expected result
	 *  4. Compare the expected result to the actual result
	 *  5. Write out success or fail messages. 
     *  6. Repeat for the next condition
     *
     * @param  args  The command line arguments
     */
    public static void main(String[] args) {
        CompareGame  game     = new CompareGame();

        //
        // Test 1
        //
        // Set up the game
        //
        game.setRandomNumber(50);

        //If user guesses right the method will return
        //"correct"
        String       results  = game.takeGuess(50);

        if (results.equals("correct")) {
            System.out.println("success");
        } else {
            System.out.println("failure");
        }

        //
        // Test 2
        //
        game = new CompareGame();
        game.generateRandomNumber();

        int          number   = game.getRandomNumber();
        System.out.println(number);

        if (number > 0 && number < 101) {
            System.out.println("success");
        } else {
            System.out.println("failure");
        }
    }
}
