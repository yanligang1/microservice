package com.yanlg.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.yanlg.cloud.entity.User;

@RestController
public class MovieController {
	@Autowired
	private RestTemplate restTemplate;
	@Value("${user.userservicepath}")
	private String userServicePath;
	@GetMapping("/getmovieuser")
	public User getMovieUser() {
		return restTemplate.getForObject(userServicePath, User.class);
	}
}
