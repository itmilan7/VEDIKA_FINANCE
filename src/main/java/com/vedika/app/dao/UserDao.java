package com.vedika.app.dao;

import com.vedika.app.dto.UsersDto;
import com.vedika.app.model.Users;

public interface UserDao {

	public int saveUser(Users users);
	public UsersDto getUser();
	
}
