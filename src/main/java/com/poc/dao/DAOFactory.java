/**
 * 
 */
package com.poc.dao;

/**
 * @author niel_liu
 *
 */
public class DAOFactory {
	
	private static MessageInfoDAO messageInfoDAO = null;
	
	private static UserDAO userDAO = null;

	/**
	 * Return the DAO that process for MessageInfo related DB operation
	 * 
	 * @return
	 */
	public static IMessageInfoDAO getMessageInfoDAO() {
		if(messageInfoDAO == null) {
			messageInfoDAO = new MessageInfoDAO();
		}
		return messageInfoDAO;
	}
	
	/**
	 * Return the DAO that process for User related DB operation
	 * 
	 * @return
	 */
	public static IUserDAO getUserDAO()	{
		if(userDAO == null)	{
			userDAO = new UserDAO();
		}
		return userDAO;
	}
}
