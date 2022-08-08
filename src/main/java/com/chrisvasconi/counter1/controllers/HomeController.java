package com.chrisvasconi.counter1.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/your_server")
	public String setCount(HttpSession session) {
		if(session.getAttribute("count")==null) {
		session.setAttribute("count", 0);	
	}
		//grab the count from the sesh and cast it into datatype
		Integer tempcount = (Integer) session.getAttribute("count");
		//Incremented the temp var
		tempcount++;
		//set the sesh w/ new temp
		session.setAttribute("count", tempcount);
		//increase the count in the session
		return "getcount.jsp";
}
	@GetMapping("/your_server/counter")
	public String getCount() {
		return "counter.jsp";
	}
}
