public class Author {
    private String authorName;
    private String secondName;


    public Author(String name, String secondName) {
        this.authorName = name;
        this.secondName = secondName;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getSecondName() {
        return this.secondName;
    }
}

