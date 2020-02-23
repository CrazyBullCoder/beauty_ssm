package com.nrd.demo.service;

import java.util.List;

import com.nrd.demo.entity.User;

public interface UserService {

	List<User> getUserList(int offset, int limit);
	 
}
