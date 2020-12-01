package domain;

public class Contact {

    private String name;
    private String email;


    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }


    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
