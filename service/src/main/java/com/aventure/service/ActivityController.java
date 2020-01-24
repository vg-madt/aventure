package com.aventure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aventure.repo.ActivityRepository;

@RestController
public class ActivityController {
	@Autowired
    private ActivityRepository repo;
	@RequestMapping("/HelloWorld")
	public String method() {
		return "Hello World";
	}

}
