import java.util.ArrayList;

/**
 * Program javadoc goes here.  Tell what the class is/does
 *
 * @author rjbielby
 */
public class Tester {

    public static void main(String[] args) {
        InputHelper helper = new InputHelper();

        // String input = helper.getUserInput("Enter a number: ");
        // float inputNumber = Float.parseFloat(input);
        // System.out.println("Is this what you entered?  " + inputNumber);
        //
        // Dog[] dogs = new Dog[10];
        // dogs[0] = new Dog();

        ArrayList<Dog> dogList = new ArrayList<Dog>();
        Dog dog = new Dog();
        dog.setName("Wilson");
        dog.setOwner("Randy");
        dog.setWeight(34);
        dogList.add(dog);

        Dog anotherDog = new Dog();
        dogList.add(anotherDog);

        Dog theDog = dogList.get(0);
        System.out.println(theDog.getName());

        System.out.println("Size of the array : " + dogList.size());

        dogList.remove(theDog);
        System.out.println("Size of the array after removing theDog  : " + dogList.size());

        ArrayList<String> stringList = new ArrayList<String>();
        String theString = new String("blah");
        stringList.add(theString);

        System.out.println("The stringList contains blah? " + stringList.contains(theString));
        System.out.println("where is blah " + stringList.indexOf(theString));



    }
}
