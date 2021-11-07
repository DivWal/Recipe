package com.receipe.demo.services;


import java.util.List;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;
import com.receipe.demo.dao.ReceipeDao;
import com.recipe.demo.entities.Receipe;

@Service
@EnableMongoRepositories("com.receipe.demo.dao")
public class ReceipeServiceImpl implements ReceipeService {


	@Autowired
	private ReceipeDao receipedao;

	public ReceipeServiceImpl() {
	}
	
	
	@Override
	public List<Receipe> getReceipe() {
		return receipedao.findAll();
	}

	@Override
	public Optional<Receipe> getReceipe(Integer receipeId) {
		return receipedao.findById(receipeId);
	}

	@Override
	public Receipe addReceipe(Receipe receipe) {
		receipedao.save(receipe);
		return receipe;
	}


	@Override
	public void saveAll(List<Receipe> receipes) {
		for(Receipe receipe:receipes)
		{
		  receipedao.save(receipe);
		}
		
	}


	@Override
	public String getReceipeImage(Integer receipeId) {
		Optional<Receipe> receipe=receipedao.findById(receipeId);
		if (receipe.isPresent()) {
	        Receipe r= receipe.get();
	        return r.getImage();
		}
		return "Image not present";
	}
	
}
