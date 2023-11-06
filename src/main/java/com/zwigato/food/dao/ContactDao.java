package com.zwigato.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zwigato.food.model.Contact;

public interface ContactDao extends JpaRepository<Contact,Integer> {
}
