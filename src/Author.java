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
}
