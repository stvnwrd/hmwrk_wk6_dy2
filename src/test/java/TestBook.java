import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBook {

    private Book book;

    @Before
    public void before(){
        book = new Book("A Whiff of Burnt Boats", GenreType.BIOGRAPHY);
    }

    @Test
    public void bookHasGenre(){
        assertEquals(GenreType.BIOGRAPHY, book.getGenre());
    }

    @Test
    public void bookGenreHasDescription(){
        assertEquals("People's lives", book.getDescription());
    }


}
