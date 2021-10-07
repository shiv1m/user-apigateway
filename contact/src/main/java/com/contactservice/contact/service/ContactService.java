package com.contactservice.contact.service;

import com.contactservice.contact.entity.Contact;

import java.util.List;

public interface ContactService {

    Contact saveContactDetails(Contact contact);

    List<Contact> getContactsOfUser(Long userId);
}
