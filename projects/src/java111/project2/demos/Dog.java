/**
 *  This Dog class shows different behavior depending on size.
 *
 *@author    eknapp
 */
public class Dog {

    private int size;
    private String  name;

    /**
     * sets the size of the dog
     * @param int the size of the dog
     */
    public void setSize(int size) {
        size = size;
        System.out.println("This is the value of the parameter size " + size);
    }

    /**
     * return the dog size
     *
     * @return the dog size 
     */
    public int getSize() {
        return size;
    }

    /**
     *  This method is the code for the bark action
     *
     * @param size the size of the dog
     */
    void bark(int size) {

        if (size > 60) {
            System.out.println("Wooof! Woooof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}
