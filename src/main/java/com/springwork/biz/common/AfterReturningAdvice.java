package com.springwork.biz.common;

import org.aspectj.lang.JoinPoint;
import com.springwork.biz.user.UserVo;

public class AfterReturningAdvice {
	public void afterLog(JoinPoint jp, Object returnObj) {
		String method = jp.getSignature().getName();
		
		if (returnObj instanceof UserVo) {
			UserVo user = (UserVo) returnObj;
			
			if (user.getRole().equals("Admin")) {
				System.out.println(user.getName() + "로그인 (Admin)");
			}
		}
		System.out.println("[사후처리] " + method + "() 메소드 리턴값 : " + returnObj.toString());
	}
}
