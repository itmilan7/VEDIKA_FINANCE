package com.vedika.app.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.vedika.app.dao.UserDao;
import com.vedika.app.dto.UsersDto;
import com.vedika.app.model.Users;

@Service
public class UserServiceImpl implements UserService {

	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	@Transactional
	public int saveUser(Users users){
		int result = this.userDao.saveUser(users);
		return result;
	}
	@Override
	@Transactional
	public UsersDto getUser(){
		return null;
	}
}
