import java.util.Objects;
import java.time.LocalDate;

public class Book {
    private String bookName;
    private Author author;
    private int publicationYear;

    public Book (String bookName, Author author, int publicationYear) {
        this.bookName = bookName;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        if (publicationYear < 0 || publicationYear > LocalDate.now().getYear()) {
            throw  new IllegalArgumentException ("Год не может быть отрицательным или больше текущего");
        }
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return author + ": " + "\"" + bookName + "\", " + publicationYear + "г.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && bookName.equals(book.bookName) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, publicationYear);
    }
}
