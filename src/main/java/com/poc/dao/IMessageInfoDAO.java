/**
 * 
 */
package com.poc.dao;

import java.util.List;

import com.poc.modelobjects.MessageInfo;

/**
 * This is a DAO interface which define all the functions will be called by other modules
 * 
 * We can define any interface that can be used by others. Here just add one selectAll() as a example.
 * 
 * @author niel_liu
 *
 */
public interface IMessageInfoDAO {
	
	public List<MessageInfo> selectAll();	//select all messages from database

}
