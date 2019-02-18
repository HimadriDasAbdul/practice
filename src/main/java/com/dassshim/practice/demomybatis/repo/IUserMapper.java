package com.dassshim.practice.demomybatis.repo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.dassshim.practice.demomybatis.entity.User;

@Mapper
public interface IUserMapper {

	
	@Select("Select * from User")
	public List<User> findAll();
	
	
	@Update(value = { "update user set password = #{password}" })
	public void updatePassword(String password);
}
