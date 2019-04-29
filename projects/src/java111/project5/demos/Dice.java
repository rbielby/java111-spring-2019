import java.util.*;

/**
 * Program javadoc goes here.  Tell what the class is/does
 *
 * @author rjbielby
 */
public class Dice {

    public static int sidesOfDice = 6;
    public static final int MAX_SIDES_OF_DICE = 12;
    private int faceValue = 0;
    private Random random;

    public Dice() {
        random = new Random();
    }

    public int roll() {
        this.faceValue = random.nextInt(sidesOfDice) + 1;
        return this.faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public static void changeNumberOfSides(int newNumberOfSides) {
        Dice.sidesOfDice = newNumberOfSides;
    }
}
