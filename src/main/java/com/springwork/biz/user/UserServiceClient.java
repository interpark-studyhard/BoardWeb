package com.springwork.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {

	public static void main(String[] args) {
		
		// 1. 컴테이너 구동
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. 컨테이너로부터 UserServiceImpl 객체 lookup
		UserService userService = (UserService) container.getBean("userService");
		
		// 3. 로그인 기능 테스트
		UserVo vo = new UserVo();
		vo.setId("test");
		vo.setPassword("test123");
		
		UserVo user = userService.getUser(vo);
		
		if(user != null) {
			System.out.println(user.getName()+"님 환여합니당~.~");
		} else {
			System.out.println("로그인실패");
		}
		
		// 4. 컨테이너 종료
		container.close();
	}

}
