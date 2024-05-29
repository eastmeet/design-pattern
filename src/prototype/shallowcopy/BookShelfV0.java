package prototype.shallowcopy;

import java.util.ArrayList;
import java.util.List;

public class BookShelfV0 implements Cloneable {

    private final List<BookV0> shelf;

    public BookShelfV0() {
        shelf = new ArrayList<>();
    }

//     얕은 복사 shallow copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void addBook(BookV0 book) {
        shelf.add(book);
    }

    public List<BookV0> getShelf() {
        return shelf;
    }

    @Override
    public String toString() {
        return shelf.toString();
    }

}
