package com.dassshim.practice.demomybatis.service;

import java.util.List;

import com.dassshim.practice.demomybatis.entity.User;

public interface IPracticeUser {
	
	void updateUser(User user, String userId);
	
	List<User> getAllUser();
}
