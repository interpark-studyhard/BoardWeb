package com.springwork.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public interface BoardServiceClient {
	
	public static void main(String[] args) {
		// 1. spring 컨테이너 구동
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. spring 컨테이너로부터 boardServiceImpl 객체 lookup
		BoardService boardService = (BoardService) container.getBean("boardService");
		
		// 3. 글 등록 기능 테스트
		BoardVo vo = new BoardVo();
		vo.setWriter("홍길동");
		vo.setTitle("제목~.~");
		vo.setContent("냐하 내용....~");
		
		boardService.insertBoard(vo);
		
		// 4.글 목록 검색 기능 테스트
		List<BoardVo> boardList = boardService.getBoardList(vo);
		
		for (BoardVo board : boardList) {
			System.out.println("==============>" + board.toString());
		}
		
		// 5. 컨테이너 종료
		container.close();
	}
}