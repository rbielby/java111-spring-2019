package java111.project5.demos;

/**
 * Program javadoc goes here.  Tell what the class is/does
 *
 * @author rjbielby
 */
public class PackageIt {

    public static void main(String[] args) {
        PackageIt packageIt = new PackageIt();
        packageIt.run();
        System.out.println("hello world");
    }



    private void run() {
        System.out.println(this.getClass().getName());
    }
}
