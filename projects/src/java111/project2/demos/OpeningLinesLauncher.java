/** Object reference demo using literature
*   What does "pass by value / pass by copy" mean, and what does it look like?
 *  @author kkohler
 */
public class OpeningLinesLauncher {

    /** main method creates OpeningLines objects, sets instance variables,
     *  and calls their recite() method. It will then switch object
     *  reference variables and call recite() method again to demonstrate
     *  "pass by copy".
     */
    public static void main(String[] args) {

        /** create OpeningLines objects
         */
        OpeningLines loveInTheTimeOfCholera = new OpeningLines();
        OpeningLines hillHouse = new OpeningLines();

        /** set the instance variables of first object
         */
        loveInTheTimeOfCholera.title = "Love in the Time of Cholera";
        loveInTheTimeOfCholera.author = "Gabriel Garcia Marquez";
        loveInTheTimeOfCholera.yearPublished = 1985;
        loveInTheTimeOfCholera.openingLines = "It was inevitable: "
                + "the scent of bitter almonds always reminded him of the fate "
                + "of unrequited love.";

        /** set the instance variables of second object
         */
        hillHouse.title = "'The Haunting of Hill House'";
        hillHouse.author = "Shirley Jackson";
        hillHouse.yearPublished = 1959;
        hillHouse.openingLines = "No live organism can continue for long to "
                + "exist sanely under conditions of absolute reality; even "
                + "larks and katydids are supposed, by some, to dream. "
                + "Hill House, not sane, stood by itself against the hills, "
                + "holding darkness within.";

        /** Output both objects' info using reciteLines() method, as well as
         *  surrounding text
         */
        System.out.println(System.lineSeparator()
                + "From 'loveInTheTimeOfCholera.author' "
                + loveInTheTimeOfCholera.author
                +  ", published " + loveInTheTimeOfCholera.yearPublished
                + ":" + System.lineSeparator());
        loveInTheTimeOfCholera.reciteLines();

        System.out.println(System.lineSeparator());

        System.out.println(System.lineSeparator() + "From 'hillHouse.author' "
                + hillHouse.author + ", published " + hillHouse.yearPublished
                + ":" + System.lineSeparator());
        hillHouse.reciteLines();

        /** re-assign object reference variables:
         *  assign second object reference to the first object reference.
         *  Remember: java passes by copy
         */
        loveInTheTimeOfCholera = hillHouse;

        /** assign new values to the variables of both object references
         */
        loveInTheTimeOfCholera.title = "A Stranger in Olondria";
        loveInTheTimeOfCholera.author = "Sofia Samatar";
        hillHouse.yearPublished = 2013;
        hillHouse.openingLines = "As I was a stranger in Olondria, I knew "
            + "nothing of the splendor of its coasts, nor of Bain, the "
            + "Harbor City, whose lights and colors spill into the ocean like "
            + "a cataract of roses.";

        /** Output both objects' info again to see what's changed
         */
        System.out.println(System.lineSeparator() + System.lineSeparator());

        System.out.println("****The same output methods *after* coding "
                + "'loveInTheTimeOfCholera = hillHouse;' and assigning "
                + "new values, is:" + System.lineSeparator());

        System.out.println("From 'loveInTheTimeOfCholera.author' "
                + loveInTheTimeOfCholera.author
                +  ", published " + loveInTheTimeOfCholera.yearPublished
                + ":" + System.lineSeparator());
        loveInTheTimeOfCholera.reciteLines();

        System.out.println(System.lineSeparator());

        System.out.println(System.lineSeparator() + "From 'hillHouse.author' "
                + hillHouse.author + ", published " + hillHouse.yearPublished
                + ":" + System.lineSeparator());
        hillHouse.reciteLines();

        /** reassign hillHouse object to null
         */
        hillHouse = null;

        /** Output both objects' info yet again to see what's changed
         */
        System.out.println(System.lineSeparator() + System.lineSeparator());

        System.out.println("****The same output methods *after* coding "
                +   "hillHouse = null;' is:" + System.lineSeparator());

        System.out.print("From 'loveInTheTimeOfCholera.author' "
                + loveInTheTimeOfCholera.author
                +  ", published " + loveInTheTimeOfCholera.yearPublished + ":");
        loveInTheTimeOfCholera.reciteLines();

        System.out.println(System.lineSeparator());

        System.out.print("From 'hillHouse.author' " + hillHouse.author
                + ", published " + hillHouse.yearPublished + ":");
        hillHouse.reciteLines();

        /** Make a note of that "NullPointerException".
         *  Likely we'll see it again, by mistake. But now we know what it means!
         */
    }
}
