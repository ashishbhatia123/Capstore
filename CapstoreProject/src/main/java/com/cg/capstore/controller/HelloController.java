//http://localhost:7070/hello
package com.cg.capstore.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String hello()
	{
		return "index";
	}

}
