public class OverFlowTester {
    static int counter = 10;
    public static void main (String[] args) {

        long start = System.currentTimeMillis();

        while (counter > 0) {
            if (Integer.valueOf(counter).equals(Integer.MAX_VALUE)) {
                System.out.println("Max value of counter reached " + counter);
                System.out.println("Max value in binary          " + Integer.toBinaryString(counter));
                counter++;
                System.out.println();
                System.out.println("Max value plus 1             " + counter);
                System.out.println("Max plus one in binary       " + Integer.toBinaryString(counter));
            } else {
                counter++;
            }
        }

        System.out.println("That only took " + (System.currentTimeMillis() - start) + " milliseconds");
    }
}