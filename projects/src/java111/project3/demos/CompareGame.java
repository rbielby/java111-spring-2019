/**
 * Logic for the Compare Game. This is currently the minimum code to get the unit tests to pass
 * @author    author 
 */
public class CompareGame {

    private  int  randomNumber;


    /**
     *  Description of the Method
     */
    public void generateRandomNumber() {
        randomNumber = (int)(Math.random() * 100);
    }


    /**
     *  Description of the Method
     *
     * @param  guess  Description of the Parameter
     * @return        Description of the Return Value
     */
    public String takeGuess(int guess) {

        if (guess == randomNumber) {
            return "correct";
        } else {
            return "guess again";
        }

    }


    /**
     *  Sets the randomNumber attribute of the CompareGame object
     *
     * @param  randomNumber  The new randomNumber value
     */
    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }


    /**
     *  Gets the randomNumber attribute of the CompareGame object
     *
     * @return    The randomNumber value
     */
    public int getRandomNumber() {
        return randomNumber;
    }
}