package domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ContactBookTest {

    @Test
    void storeContacts_thenVerifyContactsAreStored() {
        // Skapa tre kontakter
        Contact contact1 = new Contact("Kalle", "kalle@ankeborg.com");
        Contact contact2 = new Contact("Kajsa", "kajsa@ankeborg.com");
        Contact contact3 = new Contact("Klarabella", "klarabella@ankeborg.com");

        // Spara dessa tre kontakter till ContactBook
        ContactBook contactBook = new ContactBook();
        contactBook.addContact(contact1);
        contactBook.addContact(contact2);
        contactBook.addContact(contact3);

        // Lägg till kontakter i lokal lista
        List<Contact> addedContacts = new ArrayList<>();
        addedContacts.add(contact1);
        addedContacts.add(contact2);
        addedContacts.add(contact3);

        List<Contact> foundContacts = contactBook.getListOfContacts();

//        assertEquals(3, foundContacts.size());
        assertEquals(addedContacts, foundContacts);
//        assertArrayEquals(addedContacts.toArray(), foundContacts.toArray());

    }

    @Test
    void deleteContact_thenVerifyContactIsDeleted() {
        // Skapa tre kontakter
        Contact contact1 = new Contact("Kalle", "kalle@ankeborg.com");
        Contact contact2 = new Contact("Kajsa", "kajsa@ankeborg.com");
        Contact contact3 = new Contact("Klarabella", "klarabella@ankeborg.com");

        // Spara dessa tre kontakter till ContactBook
        ContactBook contactBook = new ContactBook();
        contactBook.addContact(contact1);
        contactBook.addContact(contact2);
        contactBook.addContact(contact3);

        contactBook.removeContact(contact2);

        List<Contact> foundContacts = contactBook.getListOfContacts();

        assertEquals(2, foundContacts.size());

    }

}
