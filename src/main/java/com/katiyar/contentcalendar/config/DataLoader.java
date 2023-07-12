package com.katiyar.contentcalendar.config;

import java.io.InputStream;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.katiyar.contentcalendar.repository.ContentRepository;
import com.katiyar.contentcalendar.model.*;

@Component
public class DataLoader implements CommandLineRunner{

	private final ContentRepository repository;
	
	private final ObjectMapper objectMapper;
	
	public DataLoader(ContentRepository repository , ObjectMapper objectMapper) {
		this.repository = repository;
		this.objectMapper = objectMapper;
	}

	@Override
	public void run(String... args) throws Exception {
		try(InputStream inputStream=TypeReference.class.getResourceAsStream("/data/content.json")){
			repository.saveAll((Iterable<Content>) objectMapper.readValue(inputStream,new TypeReference<List<Content>>() {}));
			
		}
	}

}
