/**
 * 
 */
package com.cwms.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSONObject;
import com.cwms.model.User;
import com.cwms.service.LoginService;

/**
 * @author IA-Neusoft
 *
 */

@Controller
@RequestMapping("/Login.do")
public class LoginController {

	@Resource
	private LoginService loginService;
	
	@RequestMapping(value="/Login", method = RequestMethod.POST)
	public void doLoginSystem(HttpServletRequest request, HttpServletResponse response) {
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User(userName, password);
		boolean result = this.loginService.validation_information(user);
		System.out.println("userName=" + userName);
		System.out.println("password=" + password);
		System.out.println();
		JSONObject jsonObject = new JSONObject();
		if (result) {
			jsonObject.put("code", 200);
		} else {
			jsonObject.put("code", 401);
		}
		response.setContentType("application/json;charset=utf-8");
        try {
			response.getWriter().print(jsonObject);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
