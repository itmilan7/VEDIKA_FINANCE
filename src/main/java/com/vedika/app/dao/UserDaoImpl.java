package com.vedika.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vedika.app.dto.UsersDto;
import com.vedika.app.model.Users;

@Repository
public class UserDaoImpl implements UserDao {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Override
	public int saveUser(Users users){
		Session session = this.sessionFactory.getCurrentSession();
		session.save(users);
		return 1;
	}
	@Override
	public UsersDto getUser(){
		
		return null;
	}
}
