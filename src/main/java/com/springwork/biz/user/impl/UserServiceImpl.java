package com.springwork.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springwork.biz.user.UserService;
import com.springwork.biz.user.UserVo;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAO userDAO;
	
	public UserVo getUser(UserVo vo) {
		return userDAO.getUser(vo);
	}
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
}
