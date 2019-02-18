package com.dassshim.practice.demomybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dassshim.practice.demomybatis.entity.User;

@RestController
public class PraticeOnUserController implements IPracticeUser {

	@Autowired 
	private PraticeService practice;
	
	
	@RequestMapping(method=RequestMethod.PUT, value="/users/{userId}")
	public void updateUser(@RequestBody User user, @PathVariable String userId) {
		
		practice.updateUser(user, userId);
		
	}


	@Override
	@GetMapping(path="/users")
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return practice.finaAll();
	}

	

}
