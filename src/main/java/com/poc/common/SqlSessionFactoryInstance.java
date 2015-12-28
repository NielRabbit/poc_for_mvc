/**
 * 
 */
package com.poc.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author niel_liu
 *
 */
public class SqlSessionFactoryInstance {
	
	private static final Logger log = LogManager.getLogger(SqlSessionFactoryInstance.class.getName()); 
	
	private static String configFile = "mybatis-conf.xml";
		
	private static SqlSessionFactory ssf;	//the instance to hold the object of SqlSessionFactory, it exists for the whole application
	
	static 
	{
		log.debug("[Niel] SqlSessionFactoryInstance static area init...");
		try
		{
			InputStream is = Resources.getResourceAsStream(configFile);
			ssf = new SqlSessionFactoryBuilder().build(is);
		}
		catch(IOException e)
		{
			e.printStackTrace();
			log.error("[Niel] SqlSessionFactoryInstance exception: " + e.getMessage());
		}
	}
	
	/**
	 * Singleton model to return the instance
	 * 
	 * @return
	 */
	public static SqlSessionFactory getInstance()
	{
		if(ssf == null)
		{
			//Should not go here
			log.info("[Niel] in getInstance() [SqlSessionFactoryInstance], and instance is null, will create new one.");
			try
			{
				InputStream is = Resources.getResourceAsStream(configFile);
				ssf = new SqlSessionFactoryBuilder().build(is);
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		return ssf;
	}
	
	/**
	 * Open a session for each DB operation
	 * 
	 * @return
	 */
	public static SqlSession createSession()
	{
		log.debug("[Niel] in createSession() [SqlSessionFactoryInstance].");
		SqlSession session = ssf.openSession();
		return session;
	}

	/**
	 * Close the session
	 * 
	 * @param session
	 */
	public static void closeSession(SqlSession session)
	{
		log.debug("[Niel] in closeSession() [SqlSessionFactoryInstance].");
		if(session != null)
			session.close();
	}
}
