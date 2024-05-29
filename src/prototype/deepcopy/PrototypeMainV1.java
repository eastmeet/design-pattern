package prototype.deepcopy;

public class PrototypeMainV1 {

    public static void main(String[] args) throws CloneNotSupportedException {

        BookShelfV1 bookShelf = new BookShelfV1();
        bookShelf.addBook(new BookV1("조슈아 블로크", "이펙티브자바"));
        bookShelf.addBook(new BookV1("영진닷컴", "리눅스 마스터 2급"));
        bookShelf.addBook(new BookV1("한기용", "실패는 나침반이다"));

        System.out.println(bookShelf); // [(조슈아 블로크,이펙티브자바), (영진닷컴,리눅스 마스터 2급), (한기용,실패는 나침반이다)]

        // down casting & clone
        BookShelfV1 anotherBookShelf = (BookShelfV1) bookShelf.clone();
        System.out.println(anotherBookShelf); // [(조슈아 블로크,이펙티브자바), (영진닷컴,리눅스 마스터 2급), (한기용,실패는 나침반이다)]

        bookShelf.getShelf().get(0).setAuthor("조정래");
        bookShelf.getShelf().get(0).setTitle("한강");

        // 결과 상이 -> 깊은복사를 했기 때문에 값이 다름
        System.out.println(bookShelf); // [(조정래,한강), (영진닷컴,리눅스 마스터 2급), (한기용,실패는 나침반이다)]
        System.out.println(anotherBookShelf); // [(조슈아 블로크,이펙티브자바), (영진닷컴,리눅스 마스터 2급), (한기용,실패는 나침반이다)]






    }
}
