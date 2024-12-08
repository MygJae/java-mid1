package nested.solve.ex2;

public class LibraryMain {

    public static void main(String[] args) {
        Library library = new Library(4);

        library.addBook("소년이 온다", "한강");
        library.addBook("개미", "베르나르 베르베르");
        library.addBook("객체지향의 사실과 오해", "조영호");
        library.addBook("자바 ORM 표준 JPA 프로그래밍", "김영한");
        library.addBook("OneMoreThing", "잡스");

        library.showBooks();
    }

}
