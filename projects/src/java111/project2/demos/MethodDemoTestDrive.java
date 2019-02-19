/**
 * Program javadoc goes here.  Tell what the class is/does
 *
 * @author rjbielby
 */
public class MethodDemoTestDrive {

    public static void main(String[] args) {
        int someInt = 10;
        int anotherInt = 35;

        MethodDemo demo = new MethodDemo();
        demo.calculate();

        demo.calculateTwo(someInt);
        int returnValue = demo.calculateThree(someInt, anotherInt);
        System.out.println("This is the return value : " + returnValue);
    }
}
