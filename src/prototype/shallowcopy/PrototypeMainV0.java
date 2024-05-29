package prototype.shallowcopy;

public class PrototypeMainV0 {

    public static void main(String[] args) throws CloneNotSupportedException {

        BookShelfV0 bookShelf = new BookShelfV0();
        bookShelf.addBook(new BookV0("조슈아 블로크", "이펙티브자바"));
        bookShelf.addBook(new BookV0("영진닷컴", "리눅스 마스터 2급"));
        bookShelf.addBook(new BookV0("한기용", "실패는 나침반이다"));

        System.out.println(bookShelf); // [(조슈아 블로크,이펙티브자바), (영진닷컴,리눅스 마스터 2급), (한기용,실패는 나침반이다)]

        // down casting & clone
        BookShelfV0 anotherBookShelf = (BookShelfV0) bookShelf.clone();
        System.out.println(anotherBookShelf); // [(조슈아 블로크,이펙티브자바), (영진닷컴,리눅스 마스터 2급), (한기용,실패는 나침반이다)]

        bookShelf.getShelf().get(0).setAuthor("조정래");
        bookShelf.getShelf().get(0).setTitle("한강");

        // 결과동일 -> 얕은복사를 했기 때문에 결과가 동일함
        System.out.println(bookShelf); // [(조정래,한강), (영진닷컴,리눅스 마스터 2급), (한기용,실패는 나침반이다)]
        System.out.println(anotherBookShelf); // [(조정래,한강), (영진닷컴,리눅스 마스터 2급), (한기용,실패는 나침반이다)]

    }
}
