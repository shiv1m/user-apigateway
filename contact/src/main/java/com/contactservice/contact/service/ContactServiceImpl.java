package com.contactservice.contact.service;

import com.contactservice.contact.dao.ContactDao;
import com.contactservice.contact.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    @Autowired
    private ContactDao contactDao;

    @Override
    public Contact saveContactDetails(Contact contact) {
        return contactDao.save(contact);
    }

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        List<Contact> contactList = contactDao.findAll();
        return contactList.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
