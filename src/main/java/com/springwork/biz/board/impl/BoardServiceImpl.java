package com.springwork.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springwork.biz.board.BoardService;
import com.springwork.biz.board.BoardVo;
import com.springwork.biz.common.Log4jAdvice;
import com.springwork.biz.common.LogAdvice;

@Service("boardService")
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDAO boardDAO;
	
/*
	//private LogAdvice log;
	private Log4jAdvice log;
	
	public BoardServiceImpl() {
		//log = new LogAdvice();
		//log = new Log4jAdvice();
	}
*/
	
	public void insertBoard(BoardVo vo) {
		//log.printLog();
		//log.printLogging();
		boardDAO.insertBoard(vo);
	}

	public void updateBoard(BoardVo vo) {
		//log.printLog();
		//log.printLogging();
		boardDAO.updateBoard(vo);
	}

	public void deleteBoard(BoardVo vo) {
		//log.printLog();
		//log.printLogging();
		boardDAO.deleteBoard(vo);		
	}

	public BoardVo getBoard(BoardVo vo) {
		//log.printLog();
		//log.printLogging();
		return boardDAO.getBoard(vo);
	}

	public List<BoardVo> getBoardList(BoardVo vo) {
		//log.printLog();
		//log.printLogging();
		return boardDAO.getBoardList(vo);
	}

}