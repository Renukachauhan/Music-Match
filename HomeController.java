package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.model.Users;
import com.niit.service.UserService;

@Controller
public class HomeController {


	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
    }
	
	@RequestMapping("/index")
	
		public String index()
		{
			return "index";
	}
	


@RequestMapping("/AboutUs")
public String aboutus()
{
	return "AboutUs";
}


@RequestMapping("/Product")
public String product()
{
	return "Product";
}

}
