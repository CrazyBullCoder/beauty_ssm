package com.nrd.demo.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nrd.demo.dao.UserDao;
import com.nrd.demo.entity.User;
import com.nrd.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private UserDao userDao;
	// @Autowired
	// private RedisCache cache;

	@Override
	public List<User> getUserList(int offset, int limit) {
		return userDao.queryAll(offset, limit);
	}

}
