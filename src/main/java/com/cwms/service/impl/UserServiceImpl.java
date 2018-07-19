/**
 * 
 */
package com.cwms.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cwms.dao.UserMapper;
import com.cwms.model.User;
import com.cwms.service.UserService;

/**
 * @author IA-Neusoft
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource
	private UserMapper userDao;
	
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}

}
