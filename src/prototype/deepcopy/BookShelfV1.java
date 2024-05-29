package prototype.deepcopy;

import java.util.ArrayList;
import java.util.List;

public class BookShelfV1 implements Cloneable {

    private List<BookV1> shelf;

    public BookShelfV1() {
        shelf = new ArrayList<>();
    }

    // 깊은 복사 deep copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        BookShelfV1 another = (BookShelfV1) super.clone();
        another.shelf = new ArrayList<>();

        for (BookV1 book : shelf) {
            another.addBook(new BookV1(book.getAuthor(), book.getTitle()));
        }
        return another;
    }

    public void addBook(BookV1 book) {
        shelf.add(book);
    }

    public List<BookV1> getShelf() {
        return shelf;
    }

    @Override
    public String toString() {
        return shelf.toString();
    }

}
