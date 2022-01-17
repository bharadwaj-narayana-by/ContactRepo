package com.by.bharadwaj.service;

import com.by.bharadwaj.pojo.Contact;

import java.util.List;

public interface ContactService {
    public Contact getContact();
    public void sortAndDisplayContacts(List<Contact> contactList);
}
