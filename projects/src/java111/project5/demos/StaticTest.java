/**
 * Program javadoc goes here.  Tell what the class is/does
 *
 * @author rjbielby
 */
public class StaticTest {

    /**
     * This the main method to run a test of static methods
     *
     *
     */
    public static void main(String[] args) {

        System.out.println("==== Math.round() ======");
        for (int i = 0; i < 10; i++) {
            double random = Math.random();
            System.out.println(random + " - " + Math.round(random));
        }

        System.out.println("The value of PI is  " + Math.PI);
        System.out.println("Here\'s a random number " + Math.random());
        staticMethod();

        StaticTest testObject = new StaticTest();
        testObject.test();

        System.out.println();
        System.out.println("========= Math.random() =========");
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }
    }

    public static void staticMethod() {
        System.out.println("This is the static method");
    }

    public void test() {
        System.out.println("This is the test method");

        StaticTest.staticMethod();
    }
}
