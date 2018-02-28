public class Book {

    private String title;
    private GenreType genre;

    public Book(GenreType genre) {

        this.title = title;
        this.genre = genre;
    }

    public GenreType getGenre() {
        return genre;
    }

    public String getDescription() {
        return this.genre.getDescription();
    }

}
