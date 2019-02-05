/**
 *  The Dog class which we will use to make our first objects! Woo Hoo!!
 *
 *@author    eknapp
 */
public class Dog {

    int     size;
    String  breed;
    String  name;


    /**
     *  This method is the code for the bark action
     */
    void bark() {
        if (size > 70) {
            System.out.println("Ruff! Ruff!");
        } else if (size > 25) {
            System.out.println("Woof woof");
        } else {
            System.out.println("Yap yap");
        }

    }

}
