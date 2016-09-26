package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
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



@RequestMapping("/Login")

public String login()
{
	return "Login";
}


@RequestMapping("/SignUp")

public String signup()
{
	return "SignUp";
}


@RequestMapping("/Product")
public String product()
{
	return "Product";
}

}
