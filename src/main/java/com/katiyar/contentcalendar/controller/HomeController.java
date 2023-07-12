package com.katiyar.contentcalendar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.katiyar.contentcalendar.config.ContentCalendarProperties;

@RestController
public class HomeController {
	
//	@Value("${cc.welcomeMessage:Default Welcome Message}")
//	private String welcomeMessage;
//	
//	@Value("${cc.about}")
//	private String about;
	
	private final ContentCalendarProperties properties;
	
	public HomeController(ContentCalendarProperties properties) {
		
		this.properties = properties;
	}

	@GetMapping("/")
     public ContentCalendarProperties home() {
    	 return properties;
     }
}
