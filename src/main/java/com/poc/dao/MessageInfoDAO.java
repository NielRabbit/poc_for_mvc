/**
 * 
 */
package com.poc.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.poc.common.SqlSessionFactoryInstance;
import com.poc.modelobjects.MessageInfo;
import com.poc.mybatis.mapper.MessageInfoMapper;

/**
 * @author niel_liu
 *
 */
public class MessageInfoDAO implements IMessageInfoDAO {

	private final Logger log = LogManager.getLogger(MessageInfoDAO.class.getName()); 
	
	@Override
	public List<MessageInfo> selectAll() {
		
		log.debug("[Niel] in selectAll() [MessageInfoDAO].");
		
		List<MessageInfo> result = null;
		
		SqlSession session = SqlSessionFactoryInstance.createSession();
		if(session != null)
		{
			try
			{		
				MessageInfoMapper mapper = session.getMapper(MessageInfoMapper.class);
		
				result = mapper.selectAllMessageInfo();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				log.error("[Niel] MessageInfoDAO exception: " + e.getMessage());	
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
		
		log.debug("[Niel] end selectAll() [MessageInfoDAO].");
		return result;
	}

}
