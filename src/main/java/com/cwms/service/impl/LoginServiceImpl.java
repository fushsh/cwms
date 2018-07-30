/**
 * 
 */
package com.cwms.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cwms.dao.UserMapper;
import com.cwms.model.User;
import com.cwms.service.LoginService;

/**
 * @author IA-Neusoft
 *
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService {
	
	@Resource
	private UserMapper userDao;

	@Override
	public boolean validation_information(User user) {
		int reuslt = this.userDao.validation_information(user);
		if (reuslt > 0) {
			return true;
		} else {
			return false;
		}
	}

}
