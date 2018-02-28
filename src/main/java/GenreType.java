public enum GenreType {
    BIOGRAPHY("People's lives"),
    HORROR("Booooo!"),
    HISTORY("Stories told by the victors"),
    FICTION("Stories");

    private final String description;

    GenreType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}



