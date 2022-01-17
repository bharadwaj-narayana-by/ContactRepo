package com.by.bharadwaj.service;

import com.by.bharadwaj.pojo.Contact;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ContactServiceImpl implements ContactService{

    @Override
    public Contact getContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter firstName, LastName, Address, Phone Number");
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String address = scanner.nextLine();
        String phonoNo = scanner.nextLine();


        return new Contact(firstName,lastName,address,phonoNo);
    }

    @Override
    public void sortAndDisplayContacts(List<Contact> contactList) {
        System.out.println(contactList.stream().sorted(Comparator.comparing(Contact::getFirstName)).collect(Collectors.toList()));
    }
}
