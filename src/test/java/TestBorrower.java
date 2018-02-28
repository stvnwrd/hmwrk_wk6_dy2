import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

public class TestBorrower {

    private Library library;
    private Borrower borrower;
    private Book book;


    @Before
    public void before(){
        library = new Library("Alexandria", 5);
        borrower = new Borrower("Julius Caesar");
        book = new Book("A Whiff of Burnt Boats", GenreType.BIOGRAPHY);

    }

    @Test
    public void canAddBookToBorrower(){
        borrower.addBook(book);
        assertEquals(1, borrower.getLoanCount());
    }

    @Test
    public void canRemoveBookFromBorrower(){
        borrower.addBook(book);
        assertEquals(1, borrower.getLoanCount());
        Book remove = borrower.removeBook();
        assertNotNull(remove);
        assertEquals(0, borrower.getLoanCount());
    }

    @Test
    public void borrowBookFromLibrary(){
        library.addBook(book);
        borrower.borrowBook(library);
        assertEquals(1, borrower.getLoanCount());
    }




}
