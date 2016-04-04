package com.doj.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Saurabh Tyagi
 * @Component is using general purpose for creating bean any class in the spring factory it has following three types<br/>
 *	 @Controller it using for controllers in the web application<br/>
 *	 @Service it using for services for any application<br/>
 *	 @Repository it is using for back end services like data access object and repositories for accessing data from database.
 */

@Controller
public class SpringHelloController {
	
	@RequestMapping("/")
	public String sayHello(){
		return "hello";
	}
	
	@RequestMapping("/welcome")
	public String sayWelcome(){
		return "hello";
	}
}
