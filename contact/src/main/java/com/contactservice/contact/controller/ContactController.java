package com.contactservice.contact.controller;

import com.contactservice.contact.entity.Contact;
import com.contactservice.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping("/savecontact")
    public Contact saveContactDetails(@RequestBody Contact contact){
        return contactService.saveContactDetails(contact);
    }

    @GetMapping("/user/{userId}")
    public List<Contact> getContact(@PathVariable("userId") Long userId){
        return contactService.getContactsOfUser(userId);
    }
}
