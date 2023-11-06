package com.zwigato.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zwigato.food.model.Cart;

public interface CartDao extends JpaRepository<Cart,Integer> {
}
