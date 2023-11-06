package com.zwigato.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zwigato.food.model.User;

public interface UserDao extends JpaRepository<User,String> {
}
