import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> loans;

    public Borrower(String name){
        this.name = name;
        this.loans = new ArrayList<>();
    }

    public int getLoanCount(){
        return this.loans.size();
    }

    public void addBook(Book book){
        this.loans.add(book);
    }

    public Book removeBook(){
        return this.loans.remove(0);
    }

    public void borrowBook(Library library){
        Book book = library.removeBook();
        loans.add(book);
    }





}
