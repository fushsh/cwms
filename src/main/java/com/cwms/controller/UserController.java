/**
 * 
 */
package com.cwms.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.cwms.model.User;
import com.cwms.service.UserService;
import com.cwms.testmybatis.TestMyBatis;

/**
 * @author IA-Neusoft
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private static Logger logger = Logger.getLogger(UserController.class);

	@Resource
	private UserService userService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request, Model model) {
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		logger.info(user);
	    logger.info("user to json");
	    logger.info(JSON.toJSONString(user));
		model.addAttribute("user", user);
		return "user";
	}
}
