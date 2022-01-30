package edu.kosmo.ysy.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import edu.kosmo.ysy.mapper.BoardMapper;
import edu.kosmo.ysy.mapper.MemberMapper;
import edu.kosmo.ysy.vo.BoardVO;
import edu.kosmo.ysy.vo.MemberVO;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class BoardServiceImpl implements BoardService{
	
	@Inject
	private BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> getList(BoardVO board){
		log.info("Board getList()...");
		return boardMapper.getList(board);
	}

	@Override
	public List<BoardVO> getListAll() {
		log.info("Board getListAll()...");
		return boardMapper.getListAll();
	}
	
	@Override
	public BoardVO get(int bid) {
		log.info("Board get()...");
		log.info("service: " + bid);
		return boardMapper.read(bid);
	}

	@Override
	public void register(BoardVO board) {
		log.info("Board register()...");
		boardMapper.insert(board);
		
	}

	@Override
	public void remove(BoardVO board) {
		log.info("Board remove()...");
		boardMapper.delete(board);
		
	}

	@Override
	public void modify(BoardVO board) {
		log.info("Board modify()...");
		boardMapper.update(board);
		
	}


	

}