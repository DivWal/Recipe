package com.receipe.demo;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.receipe.demo.services.ReceipeService;
import com.recipe.demo.entities.Receipe;

@SpringBootApplication
public class ReceipeD {	
	
	
	@Autowired
	private ReceipeService receipeService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ReceipeD.class, args);
	}
	
	
	@Bean
    CommandLineRunner runner() {
        return args -> {
            ObjectMapper mapper = new ObjectMapper();
            TypeReference<List<Receipe>> typeReference = new TypeReference<List<Receipe>>() {
            };
            InputStream inputStream = TypeReference.class.getResourceAsStream("/receipe.json");
            try {
                List<Receipe> receipes = mapper.readValue(inputStream, typeReference);
                
                System.out.println("LENGTH noww" + receipes.size());

                receipeService.saveAll(receipes);

                System.out.println("Receipe List savedsuccesfully!");
            } catch (IOException e) {
                System.out.println("Unable to save receipe: " + e.getMessage());
            }
        };

    }
	
}





