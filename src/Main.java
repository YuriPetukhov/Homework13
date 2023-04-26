public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Пушкин", "Александр");
        Author author2 = new Author("Гоголь", "Николай");
        Book book1 = new Book("Евгений Онегин", author1, 1832);
        Book book2 = new Book("Мертвые души", author2, 1842);

        System.out.println(book1.getBookName() + " " + author1.getLastName() + " " + book1.getPublicationYear());
        System.out.println(book2.getBookName() + " " + author2.getLastName() + " " + book2.getPublicationYear());

        book1.setPublicationYear(1833);

        System.out.println(book1.getBookName() + " " + author1.getLastName() + " " + book1.getPublicationYear());

        System.out.println(author1.getFirstname() + " " + author1.getLastName());
        System.out.println(author2.getId());

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(author1);
        System.out.println(author2);

        System.out.println(book1.hashCode());
        System.out.println(author1.hashCode());

        System.out.println(book1.equals(book2));
        System.out.println(author1.equals(author2));

        System.out.println(book1.hashCode() == book2.hashCode());
        System.out.println(author1.hashCode() == author2.hashCode());

    }

}