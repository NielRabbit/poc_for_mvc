/**
 * 
 */
package com.poc.mybatis.mapper;

import com.poc.modelobjects.User;


/**
 * This is a mapper corresponding to its xml file(UserMapper.xml)
 * 
 * This is a usage defined by mybatis.
 * Each function name should be corresponding to the one defined in UserMapper.xml. So mybatis can get the mapper
 * 
 * @author niel_liu
 *
 */
public interface UserMapper {
	
	public User getUser(String username);

}
