/**
 * Program javadoc goes here.  Tell what the class is/does
 *
 * @author rjbielby
 */
public class ConstructorDemo {

    private String name;

    public ConstructorDemo() {

    }

    public ConstructorDemo(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("hello " + name);
    }
}
