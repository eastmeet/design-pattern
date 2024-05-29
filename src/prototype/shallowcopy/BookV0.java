package prototype.shallowcopy;

public class BookV0 {

    private String author;
    private String title;

    public BookV0(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "(" + author + "," + title + ")";
    }

}


