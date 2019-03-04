/**
 * Automated unit test for addition
 * @author    eknapp 
 */
public class TestAdder {

    /**
     *  1. Instantiate the class to be tested
	 *  2. Set any data on the class to be tested
	 *  3. Create a variable for the expected result
	 *  4. Compare the expected result to the actual result
	 *  5. Write out success or fail messages. 
     *
     * @param  args  The command line arguments
     */
    public static void main(String[] args) {
        Adder  adder    = new Adder();
        adder.setIntOne(5);
        adder.setIntTwo(4);

        int    results  = adder.add();

        if (results == 9) {
            System.out.println("success");
        } else {
            System.out.println("failure");
        }

    }
}
