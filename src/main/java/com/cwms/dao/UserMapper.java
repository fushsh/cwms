/**
 * 
 */
package com.cwms.dao;

import com.cwms.model.User;

/**
 * @author IA-Neusoft
 *
 */
public interface UserMapper {
	
	public int validation_information(User user);
	
	int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
