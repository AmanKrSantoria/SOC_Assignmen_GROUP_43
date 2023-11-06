package com.zwigato.food.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zwigato.food.model.Contact;

@Service
public class ContactDaoImpl{

    @Autowired
    ContactDao contactDao;

    public boolean saveMessage(Contact contact){
        contactDao.save(contact);
        return true;
    }
}
