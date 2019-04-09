import java.util.*;
/**
 * Test drive class for Book demo
 *
 * @author rjbielby
 */
public class BookTestDrive {
    /**
     *  The main program for BookTestDrive
     *
     *@param  args  The command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        // Book myBook = new Book();
        // myBook.setTitle("War and Peace");
        // myBook.setIsbn(123);
        // myBook.setAuthor("Tolstoy");
        // books.add(myBook);

        HardCopy hardCopy = new HardCopy();
        hardCopy.setTitle("The Alchemist");
        hardCopy.setIsbn(987654321);
        hardCopy.setAuthor("Jones");
        hardCopy.setLocation("Madison Public Library");
        hardCopy.setHardCover(false);
        hardCopy.setNumberOfCopies(200);
        books.add(hardCopy);

        EBook myEBook = new EBook();
        myEBook.setTitle("1984");
        myEBook.setIsbn(88888888);
        myEBook.setAuthor("Orwell");
        myEBook.setUrl("https://www.amazon.com/");
        myEBook.setCharacterCount(100000);
        books.add(myEBook);

        AudioBook myAudioBook = new AudioBook();
        myAudioBook.setTitle("War of the Worlds");
        myAudioBook.setIsbn(8484484);
        myAudioBook.setNarrator("William Shatner");
        myAudioBook.setDuration(1200);
        myAudioBook.setAuthor("Dunno");
        books.add(myAudioBook);

        displayBook(books);

    }

    private static void displayBook(ArrayList<Book> books) {
        for (Book book : books) {
            System.out.println(book.display());

        }

    }



}
