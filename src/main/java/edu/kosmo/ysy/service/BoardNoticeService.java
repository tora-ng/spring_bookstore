package edu.kosmo.ysy.service;

import java.util.List;

import edu.kosmo.ysy.vo.BoardNoticeVO;
import lombok.extern.log4j.Log4j;


public interface BoardNoticeService {
	
	public List<BoardNoticeVO> getList(int boardtype);
	
	public BoardNoticeVO get(int bid);
	
	void register(BoardNoticeVO board);
	
	void remove(BoardNoticeVO board);
	
	void modify(BoardNoticeVO board);
}