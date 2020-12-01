package domain;

import java.util.ArrayList;
import java.util.List;

public class ContactBook {

    private List listOfContacts = new ArrayList<Contact>();


    public ContactBook() {
    }

    public List getListOfContacts() {
        printListOfContacts(listOfContacts);
        return listOfContacts;
    }

    public void printListOfContacts(List<Contact> listOfContacts) {
        for (Contact contact : listOfContacts) {
            System.out.println(contact.toString());
        }
    }

    public void addContact(Contact contact) {
        listOfContacts.add(contact);

    }

    public void removeContact(Contact contact) {
        listOfContacts.remove(contact);
    }


}
