/**
 * 
 */
package com.poc.dao;

import com.poc.modelobjects.User;

/**
 * This is a DAO interface which define all the functions will be called by other modules
 * 
 * We can define any interface that can be used by others. Here just add one getUser() as a example.
 * 
 * @author niel_liu
 *
 */
public interface IUserDAO {

	public User getUser(String username);
}
