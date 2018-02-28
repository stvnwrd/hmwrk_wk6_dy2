import java.util.ArrayList;

public class Library {

    private String name;
    private int capacity;
    private ArrayList<Book> collection;

    public Library(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.collection = new ArrayList<>();
    }

    public int getBookCount(){
        return this.collection.size();
    }

    public void addBook(Book book){
        if(getBookCount() < this.capacity) {
            this.collection.add(book);
        }
    }

    public void removeBook(Book book){
        this.collection.remove(book);
    }

    public void acceptReturn(Borrower borrower){
        if(getBookCount() < this.capacity) {
            Book book = borrower.removeBook();
            addBook(book);
        }
    }

//    public void lendBook(Borrower borrower){
//        Book book = borrower.addBook(book);
//    }







}
