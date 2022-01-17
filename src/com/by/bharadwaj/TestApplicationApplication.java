package com.by.bharadwaj;

import com.by.bharadwaj.pojo.Contact;
import com.by.bharadwaj.service.ContactService;
import com.by.bharadwaj.service.ContactServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestApplicationApplication {

    ContactService contactService = new ContactServiceImpl();
    List<Contact> contactList = new ArrayList<>();

    public static void main(String[] args) {
        TestApplicationApplication application = new TestApplicationApplication();
        application.displayMenu();

    }
    private void displayMenu() {
        System.out.println("Please enter operation to perform");
        System.out.println("1) Add new Contact");
        System.out.println("2) Display sorted List");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Contact c = contactService.getContact();
                contactList.add(c);
                displayMenu();
                break;
            case 2:
                contactService.sortAndDisplayContacts(contactList);
                displayMenu();
                break;
            default:
                break;
        }
    }
}
