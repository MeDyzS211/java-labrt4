package zadanie7;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void info() {
        System.out.println(title + " - " + author);
    }
}

class PrintedBook extends Book {
    private int pages;

    public PrintedBook(String title, String author, int pages) {
        super(title, author);
        this.pages = pages;
    }

    public void info() {
        System.out.println("Печатная: " + pages + " стр.");
    }
}

class EBook extends Book {
    private int size;

    public EBook(String title, String author, int size) {
        super(title, author);
        this.size = size;
    }

    public void info() {
        System.out.println("Электронная: " + size + " МБ");
    }
}

class Library {
    private Book[] books;
    private int count;

    public Library(int size) {
        books = new Book[size];
    }

    public void add(Book b) {
        books[count++] = b;
    }

    public void showAll() {
        for (int i = 0; i < count; i++) {
            books[i].info();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Library l = new Library(2);
        l.add(new PrintedBook("Java", "Иванов", 300));
        l.add(new EBook("Python", "Петров", 5));
        l.showAll();
    }
}
