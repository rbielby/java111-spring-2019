/**
 * Program javadoc goes here
 *
 * @author rjbielby
 */
public class HardCopy extends Book implements Publishable {
    private String location;
    private boolean hardCover;
    private int numberOfCopies;

    /**
     *  Displays the detail information for the book
     *
     */
    public String display() {
        return super.display() + " | Location is " + location
            + " | Is it hard cover " + hardCover + " | Number of copies " + numberOfCopies;
    }

	/**
	* Returns value of location
	* @return
	*/
	public String getLocation() {
		return location;
	}

	/**
	* Sets new value of location
	* @param
	*/
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	* Returns value of hardCover
	* @return
	*/
	public boolean isHardCover() {
		return hardCover;
	}

	/**
	* Sets new value of hardCover
	* @param
	*/
	public void setHardCover(boolean hardCover) {
		this.hardCover = hardCover;
	}

	/**
	* Returns value of numberOfCopies
	* @return
	*/
	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	/**
	* Sets new value of numberOfCopies
	* @param
	*/
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
}
