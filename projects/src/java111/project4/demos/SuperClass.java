/**
 * Program javadoc goes here.  Tell what the class is/does
 *
 * @author rjbielby
 */
public class SuperClass {

    protected long counter;

    public void run() {
        counter = System.currentTimeMillis();
        System.out.println("This is the SuperClass " +  counter);
    }


	/**
	* Returns value of counter
	* @return
	*/
	public long getCounter() {
		return counter;
	}

	/**
	* Sets new value of counter
	* @param
	*/
	public void setCounter(long counter) {
		this.counter = counter;
	}

}
