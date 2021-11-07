package com.recipe.demo.entities;

import java.util.List;

import javax.validation.constraints.Email;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "receipe")
public class Receipe {

	
	public Receipe() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Receipe(Integer id, String name, String category, String label, String price, String image,
			@Size(min = 10, message = "description should be minumum 10 character") String description) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.label = label;
		this.price = price;
		this.image = image;
		this.description = description;
	}



	@Id
	private Integer id;

	private String name;
	private String category;
	private String label;
	private String price;
	private String image;
	
	

	@Size(min = 10, message = "description should be minumum 10 character")
	private String description;



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public String getLabel() {
		return label;
	}



	public void setLabel(String label) {
		this.label = label;
	}



	public String getPrice() {
		return price;
	}



	public void setPrice(String price) {
		this.price = price;
	}



	public String getImage() {
		return image;
	}



	public void setImage(String image) {
		this.image = image;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	@Override
	public String toString() {
		return "Receipe [id=" + id + ", name=" + name + ", category=" + category + ", label=" + label + ", price="
				+ price + ", image=" + image + ", description=" + description + "]";
	}
	

	

	

	


}
