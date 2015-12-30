/**
 * 
 */
package com.poc.common;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


/**
 * @author niel_liu
 *
 */
public class LogFactory {
	
	private static Logger logger = LogManager.getLogger(Constants.DEBUG_LOGGER_NAME);
	
	public static Logger getLogger() {
		if(logger == null) {
			logger = LogManager.getLogger(Constants.DEBUG_LOGGER_NAME);	//should not go here
		}
		
		return logger;
	}

}
