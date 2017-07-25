package com.springwork.biz.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.springwork.biz.common.JdbcUtils;
import com.springwork.biz.user.UserVo;

@Repository("userDAO")
public class UserDAO  {
	// JDBC 관련 변수
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	// SQL명령e등
	private final String USER_GET = "select * from users where id=? and password=?";

	// CRUD 기능 메소드 구현
	// 회원등록
	public UserVo getUser(UserVo vo){
		UserVo user = null;
		try {
			
			System.out.println("-------------> JDBC로 getUser() 기능 처리");
			conn = JdbcUtils.getConnection();
			stmt = conn.prepareStatement(USER_GET);
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
			rs = stmt.executeQuery();
			
			if(rs.next()){
				user = new UserVo();
				
				user.setId(rs.getString("ID"));
				user.setPassword(rs.getString("PASSWORD"));
				user.setName(rs.getString("Name"));
				user.setRole(rs.getString("Role"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(stmt, conn);
		}
		return user;
	}
}