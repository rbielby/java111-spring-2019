/**
 *  The Dog Test Drive class. We will make 3 objects of different sizes.
 *
 *@author    eknapp
 */
public class DogTestDrive {

    /**
     *  The main program for the DogTestDrive class. Why do we need a main
     *  method?
     *
     *@param  args  The command line arguments
     */
    public static void main(String[] args) {

        Dog one = new Dog();

        Dog two = new Dog();

        Dog three = new Dog();

        one.bark(70);
        two.bark(8);
        three.bark(35);
    }
}
