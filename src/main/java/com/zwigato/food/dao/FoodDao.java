package com.zwigato.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zwigato.food.model.Food;


public interface FoodDao extends JpaRepository<Food,String> {

}
