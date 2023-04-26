import java.util.Objects;

public class Author {
    private String firstname;
    private String lastName;
    public static int count = 1;
    private int id;

    public Author(String lastName, String firstname){
        this.firstname = firstname;
        this.lastName = lastName;
        id = count++;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return id + " " + lastName + " " + firstname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return id == author.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
