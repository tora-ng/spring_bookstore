package edu.kosmo.ysy.service;

import java.util.List;

import edu.kosmo.ysy.vo.BoardVO;
import lombok.extern.log4j.Log4j;


public interface BoardService {
	
	public List<BoardVO> getList(BoardVO board);

	public List<BoardVO> getListAll();
	
	public BoardVO get(int bid);
	
	void register(BoardVO board);
	
	void remove(BoardVO board);
	
	void modify(BoardVO board);
}