import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    private Library library;
    private Book book;

    @Before
    public void before() {
        library = new Library("Alexandria", 5);
        book = new Book();
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



}
