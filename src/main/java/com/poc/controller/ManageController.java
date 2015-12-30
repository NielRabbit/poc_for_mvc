/**
 * 
 */
package com.poc.controller;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.poc.common.LogFactory;
import com.poc.dao.DAOFactory;
import com.poc.dao.IMessageInfoDAO;
import com.poc.modelobjects.MessageInfo;

/**
 * @author niel_liu
 *
 */
@Controller
@RequestMapping("/manage")
public class ManageController {
	

	@RequestMapping(value="search", method={RequestMethod.POST, RequestMethod.GET})
	public String search(ModelMap model) {
		Logger log = LogFactory.getLogger();
		
		log.debug("[Niel] do search() [ManageController].");
        		
		ArrayList<MessageInfo> mList = null;
		IMessageInfoDAO dao = DAOFactory.getMessageInfoDAO();
		
		mList = (ArrayList<MessageInfo>)dao.selectAll();
		
		model.addAttribute("mList", mList);
		return "main";
	}
}
