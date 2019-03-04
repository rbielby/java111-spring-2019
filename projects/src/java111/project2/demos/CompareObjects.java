/**
 * Program javadoc goes here.  Tell what the class is/does
 *
 * @author rjbielby
 */
public class CompareObjects {

    /**
     * main method to run some demos of comparing
     * objects
     */
    public static void main(String[] args) {
        int var1 = 1;
        int var2 = 34;

        System.out.println("does var1 equal var2 " + (var1 == var2));

        Dog dog1 = new Dog();
        dog1.setName(new String("Wilson"));
        dog1.setSize(34);

        Dog dog2 = new Dog();
        dog2.setName(new String("Wilson"));
        dog2.setSize(34);

        System.out.println("Dog size " + (dog1.getSize() == dog2.getSize()));

        System.out.println("Dog nanem " + (dog1.getName() == dog2.getName()));

        System.out.println("This is the way it's done " + dog1.getName().equals(dog2.getName()));

        System.out.println(dog1.equals(dog2));
    }

}
