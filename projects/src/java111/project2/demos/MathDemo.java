/**
 * Program javadoc goes here.  Tell what the class is/does
 *
 * @author rjbielby
 */
public class MathDemo {

    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        double aDouble = 51.0;

        int z = x * y;
        System.out.println("x * y " + z);

        double v = (double)y / x;

        int xyz = (int)aDouble / x;

        System.out.println("value of v " + v);

        System.out.println("value of xyz " + xyz);
    }

}
