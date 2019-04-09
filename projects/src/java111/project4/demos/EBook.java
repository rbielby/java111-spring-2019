/**
 * Class representing an e-book
 *
 * @author rjbielby
 */
public class EBook extends Book {
    private String url;
    private int characterCount;

    public void length() {
        System.out.println("here's some length");
    }

    /**
     *  Displays the detail information for the book
     *
     */
    public String display() {
        return super.display() + " | URL is " + url + " | Character count " + characterCount;
    }

	/**
	* Returns value of url
	* @return
	*/
	public String getUrl() {
		return url;
	}

	/**
	* Sets new value of url
	* @param
	*/
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	* Returns value of characterCount
	* @return
	*/
	public int getCharacterCount() {
		return characterCount;
	}

	/**
	* Sets new value of characterCount
	* @param
	*/
	public void setCharacterCount(int characterCount) {
		this.characterCount = characterCount;
	}
}
