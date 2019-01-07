package com.shishram.angular.repositories;

import com.shishram.models.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, String> {

    Contact getById(String id);

}

