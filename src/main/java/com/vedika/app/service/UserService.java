package com.vedika.app.service;

import com.vedika.app.dto.UsersDto;
import com.vedika.app.model.Users;

public interface UserService {

	public int saveUser(Users users);
	public UsersDto getUser();
}
