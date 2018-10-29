package com.yanlg.cloud.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yanlg.cloud.entity.User;

@RestController
public class UserController {
	@GetMapping("/finduser")
	public User findUser() {
		User user = new User();
		user.setId(1);
		user.setUsername("闫立刚");
		user.setSex("男");
		user.setAge(18);
		return user;
	}
}
