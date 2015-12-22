/**
 * 
 */
package com.poc.controller;

import java.util.ArrayList;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.poc.interceptor.CommonInterceptor;
import com.poc.modelobjects.MessageInfo;

/**
 * @author niel_liu
 *
 */
@Controller
@RequestMapping("/manage")
public class ManageController {
	
	private final Logger log = LogManager.getLogger(CommonInterceptor.class.getName()); 

	@RequestMapping(value="search", method={RequestMethod.POST, RequestMethod.GET})
	public String search(ModelMap model)
	{
		log.debug("do search()...");
        ArrayList<MessageInfo> mList = new ArrayList<MessageInfo>();
		
		MessageInfo mi = new MessageInfo();
		mi.setSender("wolf@niel.com");
		mi.setRecipient("rabbit@niel.com");
		mi.setSubject("This is a love letter~~");
		
		mList.add(mi);
		mList.add(mi);
		
		model.addAttribute("mList", mList);
		return "main";
	}
}
