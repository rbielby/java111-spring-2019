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

        System.out.println(one.getName());
        System.out.println(one.getSize());

        // one.bark(70);
        // two.bark(8);
        // three.bark(35);

        // one.size = 50;
        //
        // System.out.println("After setting public variable");
        //
        // one.setSize(23);


        Dog[] dogs = new Dog[5];
        dogs[0] = two;













    }
}
