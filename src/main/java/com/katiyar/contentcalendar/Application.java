package com.katiyar.contentcalendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.katiyar.contentcalendar.config.ContentCalendarProperties;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
//	@Bean
//	CommandLineRunner commandLineRunner(ContentRepository repository) {
//		return args->{
//			//insert some data into the database
//			Content content = new Content(null, "Hello CommandLineRunner", "All about Commandine Runner ", Status.IDEA, Type.ARTICLE,
//					LocalDateTime.now(), null, "");
//			
//			repository.save(content);
//		};
//	}
	
	
    
}
