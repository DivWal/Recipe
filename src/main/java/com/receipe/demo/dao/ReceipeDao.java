package com.receipe.demo.dao;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.recipe.demo.entities.Receipe;

@Repository
public interface ReceipeDao extends MongoRepository<Receipe,Integer>{
	
}
