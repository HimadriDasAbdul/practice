package com.dassshim.practice.demomybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dassshim.practice.demomybatis.entity.User;
import com.dassshim.practice.demomybatis.repo.IUserMapper;

@Service
public class PraticeService {
	
	@Autowired private IUserMapper userRepo;

	protected void updateUser(User user, String userId) {
		System.out.println("enter here " + user);
		userRepo.updatePassword(user.getPassword());
		System.out.println(user);
	}
	
	
	protected List<User> finaAll()
	{
		return userRepo.findAll();
		
	}
	
	
}
