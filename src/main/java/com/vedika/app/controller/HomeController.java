package com.vedika.app.controller;

import java.util.Locale;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vedika.app.dao.UserDao;
import com.vedika.app.dao.UserDaoImpl;
import com.vedika.app.dto.UsersDto;
import com.vedika.app.model.Users;
import com.vedika.app.service.UserService;

@Controller
public class HomeController {
	
	private UserService userService;
	
	@Autowired(required=true)
	@Qualifier(value="userService")
	public void setUserService(UserService us){
		this.userService = us;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model) {
		
		ModelAndView mav = new ModelAndView("home");
		
		return mav;
	}
	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute("users") Users users) {
		
		//UserDao userDao = new UserDaoImpl();
		int result = userService.saveUser(users);
		
		ModelAndView mav = new ModelAndView("success");
		if( result == 1)
			mav.addObject("status", "Save Successful");
		else
			mav.addObject("status", "Save Successful");
		return mav;
	}
}
