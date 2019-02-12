/** Demonstrate a few primitives
 * @author pwaite
 */

public class PrimitiveDemo {

    public String name;

    public void calculate() {
        int myInt = 60000;
        //this results in lossy conversion from double to float
        float myFloat = 799.99f;
        //float myFloat = 799.99f;
        double myDouble = 65.33;
        char myChar = 'a';

        System.out.println("MyInt=> " + myInt);
        System.out.println("MyFloat=> " + myFloat);
        System.out.println("MyChar=> " + myChar);

        System.out.println(myInt + myChar);
        System.out.println(myInt + myFloat);

        float myNewFloat = myInt + myFloat;
        System.out.println("MyNewFloat=> " + myNewFloat);

        int myNewInt = myInt + (int)myFloat;
        System.out.println("myNewInt => " + myNewInt);

        long myNewLong = 123;

        int wasALong = (int)myNewLong;

    }
}
