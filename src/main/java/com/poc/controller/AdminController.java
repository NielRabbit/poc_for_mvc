package com.poc.controller;


import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.poc.interceptor.CommonInterceptor;
import com.poc.modelobjects.SessionKey;

@Controller
@RequestMapping("/admin")
class AdminController {

	private final Logger log = LogManager.getLogger(CommonInterceptor.class
			.getName());

	@RequestMapping(value = "login", method = { RequestMethod.GET, RequestMethod.POST })
	public String login(ModelMap model, HttpServletRequest request,
			@RequestParam String username, @RequestParam String password) {
		// TODO: authentic the username and password
		log.debug("[Niel] do login()... username=" + username + "/Password="
				+ password);

		model.addAttribute("username", username);
		
		request.getSession().setAttribute(SessionKey.KEY_USERNAME, username);	//After login, add the key into session

		return "main";
	}

	@RequestMapping(value = "logout")
	public String logout(ModelMap model, HttpServletRequest request) {
		request.getSession().removeAttribute(SessionKey.KEY_USERNAME);	//remove the session data
		return "index";
	}
}
