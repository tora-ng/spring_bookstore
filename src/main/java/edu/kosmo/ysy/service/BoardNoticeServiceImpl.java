package edu.kosmo.ysy.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import edu.kosmo.ysy.mapper.BoardNoticeMapper;
import edu.kosmo.ysy.mapper.MemberMapper;
import edu.kosmo.ysy.vo.BoardNoticeVO;
import edu.kosmo.ysy.vo.MemberVO;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class BoardNoticeServiceImpl implements BoardNoticeService{
	
	@Inject
	private BoardNoticeMapper boardNoticeMapper;
	
	@Override
	public List<BoardNoticeVO> getList(int boardtype){
		log.info("BoardNotice getList()...");
		return boardNoticeMapper.getList(boardtype);
	}

	@Override
	public BoardNoticeVO get(int bid) {
		log.info("BoardNotice get()...");
		log.info("service: " + bid);
		return boardNoticeMapper.read(bid);
	}

	@Override
	public void register(BoardNoticeVO board) {
		log.info("BoardNotice register()...");
		boardNoticeMapper.insert(board);
		
	}

	@Override
	public void remove(BoardNoticeVO board) {
		log.info("BoardNotice remove()...");
		boardNoticeMapper.delete(board);
		
	}

	@Override
	public void modify(BoardNoticeVO board) {
		log.info("BoardNotice modify()...");
		boardNoticeMapper.update(board);
		
	}
	

}