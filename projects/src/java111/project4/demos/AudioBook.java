/**
 * An audio book class
 *
 * @author rjbielby
 */
public class AudioBook extends Book {
    private String narrator;
    private int duration;

    /**
     *  Displays the detail information for the book
     *
     */
    public String display() {
        return super.display() + " | Narrator is " + narrator  + " | Length in minutes " + duration;
    }

	/**
	* Returns value of narrator
	* @return
	*/
	public String getNarrator() {
		return narrator;
	}

	/**
	* Sets new value of narrator
	* @param
	*/
	public void setNarrator(String narrator) {
		this.narrator = narrator;
	}

	/**
	* Returns value of duration
	* @return
	*/
	public int getDuration() {
		return duration;
	}

	/**
	* Sets new value of duration
	* @param
	*/
	public void setDuration(int duration) {
		this.duration = duration;
	}
}
