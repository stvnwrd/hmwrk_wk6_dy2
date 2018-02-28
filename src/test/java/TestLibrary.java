import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    private Library library;
    private Book book;
    private Borrower borrower;

    @Before
    public void before() {
        library = new Library("Alexandria", 5);
        book = new Book("A Whiff of Burnt Boats", GenreType.BIOGRAPHY);
        borrower = new Borrower("Julius Caesar");
    }

    @Test
    public void canGetBookCount(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book);
        assertEquals(1, library.getBookCount());
        library.removeBook(book);
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void cantExceedCapacity(){
        for (int i = 0; i<7; i++){
            library.addBook(book);
        }
        assertEquals(5,library.getBookCount());
    }

    @Test
    public void canAcceptReturnsFromBorrower(){
        borrower.addBook(book);
        library.acceptReturn(borrower);
        assertEquals(1, library.getBookCount());
    }

//    @Test
//    public void canLendBooksToBorrower(){
//        library.addBook(book);
//        library.lendBook(borrower);
//        assertEquals(0, library.getBookCount());
//        assertEquals(1, borrower.getLoanCount());
//    }



}
