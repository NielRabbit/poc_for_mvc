/**
 * 
 */
package com.poc.mybatis.mapper;

import java.util.List;

import com.poc.modelobjects.MessageInfo;

/**
 * This is a mapper corresponding to its xml file(MessageInfoMapper.xml)
 * 
 * This is a usage defined by mybatis.
 * Each function name should be corresponding to the one defined in MessageInfoMapper.xml. So mybatis can get the mapper
 * 
 * @author niel_liu
 *
 */
public interface MessageInfoMapper {
	
	public List<MessageInfo> selectAllMessageInfo();	//the function name is corresponding to MessageInfoMapper.xml

}
