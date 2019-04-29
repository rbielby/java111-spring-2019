/**
 * Program javadoc goes here.  Tell what the class is/does
 *
 * @author rjbielby
 */
public class DiceTestDrive {

    public static void main(String[] args) {
        System.out.println(Dice.sidesOfDice);

        Dice blueDice = new Dice();
        Dice redDice = new Dice();

        System.out.println("=========== Rolling " + Dice.sidesOfDice + " sided dice =============");
        for (int i = 0; i < 10; i++) {
            System.out.println("Blue dice\t" + blueDice.roll());
            System.out.println("Red dice\t" + redDice.roll());
        }

        Dice.changeNumberOfSides(8);

        System.out.println("=========== Rolling " + Dice.sidesOfDice + " sided dice =============");
        for (int i = 0; i < 10; i++) {
            System.out.println("Blue dice\t" + blueDice.roll());
            System.out.println("Red dice\t" + redDice.roll());
        }



    }
}
