/**
 * 
 */
package com.poc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.poc.common.LogFactory;
import com.poc.modelobjects.SessionKey;

/**
 * @author niel_liu
 *
 */
public class CommonInterceptor extends HandlerInterceptorAdapter  {

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		Logger log = LogFactory.getLogger();
		
		log.debug("[Niel] do postHandle()...");
	
		if(modelAndView != null) {
			modelAndView.addObject("username", request.getSession().getAttribute("username"));
		}
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		Logger log = LogFactory.getLogger();
		
		log.debug("[Niel] do preHandle(): URI=" + request.getRequestURI());
		String username = (String)request.getSession().getAttribute(SessionKey.KEY_USERNAME);
		if(username == null) {
			request.getRequestDispatcher("/WEB-INF/view/index.jsp").forward(request, response);  
			return false;
		}
		return true;
	}
}
