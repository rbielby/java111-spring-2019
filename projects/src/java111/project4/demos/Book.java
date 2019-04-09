/**
 * Superclass for a general Book
 *
 * @author rjbielby
 */
public abstract class Book {

    private String author;
    private String title;
    private int isbn;

    //public abstract void length();

    public String display() {
        return "Author is " + author + " | Title is " + title
            + " | ISBN is " + isbn;
    }

	/**
	* Returns value of author
	* @return
	*/
	public String getAuthor() {
		return author;
	}

	/**
	* Sets new value of author
	* @param
	*/
	public void setAuthor(String author) {
		this.author = author;
	}

    public void setAuthor(String firstName, String lastName) {
        this.author = firstName + " " + lastName;
    }

	/**
	* Returns value of title
	* @return
	*/
	public String getTitle() {
		return title;
	}

	/**
	* Sets new value of title
	* @param
	*/
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	* Returns value of isbn
	* @return
	*/
	public int getIsbn() {
		return isbn;
	}

	/**
	* Sets new value of isbn
	* @param
	*/
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

}
