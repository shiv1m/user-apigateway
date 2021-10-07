package com.contactservice.contact.dao;

import com.contactservice.contact.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactDao extends JpaRepository <Contact, Long>{

}
