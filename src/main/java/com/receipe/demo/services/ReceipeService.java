package com.receipe.demo.services;

import java.util.List;

import java.util.Optional;

import com.recipe.demo.entities.Receipe;

public interface ReceipeService {
	
	public List<Receipe> getReceipe();

	public Optional<Receipe> getReceipe(Integer receipeId);

	public Receipe addReceipe(Receipe receipe);

	public void saveAll(List<Receipe> receipes);

	public String getReceipeImage(Integer receipeId);

}
