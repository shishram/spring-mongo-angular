package com.shishram.angular.controllers;

import com.shishram.angular.repositories.ContactRepository;
import com.shishram.models.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContactController {

    @Autowired
    ContactRepository contactRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/contacts")
    public Iterable<Contact> contact() {
        return contactRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/contacts")
    public Contact save(@RequestBody Contact contact) {
        contactRepository.save(contact);

        return contact;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/contacts/{id}")
    public Contact show(@PathVariable String id) {
        return contactRepository.getById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/contacts/{id}")
    public Contact update(@PathVariable String id, @RequestBody Contact contact) {
        Contact c = contactRepository.getById(id);
        if (contact.getName() != null)
            c.setName(contact.getName());
        if (contact.getAddress() != null)
            c.setAddress(contact.getAddress());
        if (contact.getCity() != null)
            c.setCity(contact.getCity());
        if (contact.getPhone() != null)
            c.setPhone(contact.getPhone());
        if (contact.getEmail() != null)
            c.setEmail(contact.getEmail());
        contactRepository.save(c);
        return contact;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/contacts/{id}")
    public String delete(@PathVariable String id) {
        Contact contact = contactRepository.getById(id);
        contactRepository.delete(contact);

        return "";
    }
}
