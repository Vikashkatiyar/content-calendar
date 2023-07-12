package com.katiyar.contentcalendar.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.katiyar.contentcalendar.model.Content;
import com.katiyar.contentcalendar.model.Status;
import com.katiyar.contentcalendar.model.Type;

import jakarta.annotation.PostConstruct;

@Repository
public class ContentCollectionRepository {

	private final List<Content> contentList = new ArrayList<>();

	public ContentCollectionRepository() {

	}

	public List<Content> findAll() {
		return contentList;
	}

	public Optional<Content> findByID(Integer id) {
		return contentList.stream().filter(c -> c.id().equals(id)).findFirst();
	}

	public void save(Content content) {
	   contentList.removeIf(c-> c.id().equals(content.id()));
       contentList.add(content);
	}

	@PostConstruct
	private void init() {
		Content content = new Content(1, "My First Blog Post", "My first BLog Post", Status.IDEA, Type.ARTICLE,
				LocalDateTime.now(), null, "");

		contentList.add(content);
	}

	public boolean existsById(Integer id) {
		return contentList.stream().filter(c-> c.id().equals(id)).count()==1;
	}

	public void delete(Integer id) {
		contentList.removeIf(c-> c.id().equals(id));
	}

}
