/**
 * Program javadoc goes here.  Tell what the class is/does
 *
 * @author rjbielby
 */
public class DuckTestDrive  {

    public static void main(String[] args) {

        Duck duck1 = new Duck(10);
        Duck duck2 = new Duck(35);
        Duck duck3 = new Duck();
        Duck duck4 = new Duck();

        duck4.setCount(99);

        System.out.println("Duck1 " + duck1.getSize() + " count: " + duck1.getDuckCount());
        System.out.println("Duck2 " + duck2.getSize() + " count: " + duck2.getDuckCount());
        System.out.println("Duck3 " + duck3.getSize() + " count: " + duck3.getDuckCount());
        System.out.println("Duck4 " + duck4.getSize() + " count: " + duck4.getDuckCount());
    }
}
