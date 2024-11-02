package com.sri;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlienCollector {

	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
}
