/**
 * 
 */
package com.poc.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.poc.common.SqlSessionFactoryInstance;
import com.poc.modelobjects.User;
import com.poc.mybatis.mapper.UserMapper;

/**
 * @author niel_liu
 *
 */
public class UserDAO implements IUserDAO {
	
	private final Logger log = LogManager.getLogger(UserDAO.class.getName());

	/* (non-Javadoc)
	 * @see com.poc.dao.IUserDAO#getUser(java.lang.String)
	 */
	@Override
	public User getUser(String username) {
		log.debug("[Niel] in getUser() [MessageInfoDAO].");
		if(username == null)
		{
			log.error("[Niel] in getUser() [MessageInfoDAO], invalid parameter null for username.");
		}
		
		User user = null;
		SqlSession session = SqlSessionFactoryInstance.createSession();
		if(session != null)
		{
			try
			{		
				UserMapper mapper = session.getMapper(UserMapper.class);
		
				user = mapper.getUser(username);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				log.error("[Niel] UserDAO exception: " + e.getMessage());	
			}
			finally
			{
				if(session != null)    SqlSessionFactoryInstance.closeSession(session);
			}
		}
		else
		{
		    log.error("[Niel] session is null!!!");	
		}
		
		log.debug("[Niel] end getUser() [UserDAO].");
		
		return user;
	}

}
