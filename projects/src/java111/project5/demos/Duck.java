/**
 * Program javadoc goes here.  Tell what the class is/does
 *
 * @author rjbielby
 */
public class Duck {
    private static int duckCount;

    private int size = 20;

    public Duck() {
        System.out.println("this is the default/no-arg constructor");
        duckCount++;
    }

    public Duck(int size) {
        this();
        System.out.println("this is the int constructor");
        this.size = size;
    }

    public static void setCount(int newCount) {
        duckCount = newCount;
    }
	/**
	* Returns value of duckCount
	* @return
	*/
	public static int getDuckCount() {
		return duckCount;
	}

	/**
	* Returns value of size
	* @return
	*/
	public int getSize() {
		return size;
	}

	/**
	* Sets new value of size
	* @param
	*/
	public void setSize(int size) {
		this.size = size;
	}
}
