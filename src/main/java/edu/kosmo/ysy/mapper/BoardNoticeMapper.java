package edu.kosmo.ysy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import edu.kosmo.ysy.vo.AuthVO;
import edu.kosmo.ysy.vo.BoardNoticeVO;
import edu.kosmo.ysy.vo.MemberVO;

@Mapper
public interface BoardNoticeMapper {
	List<BoardNoticeVO> getList();
	
	BoardNoticeVO read(int bid);
	
	BoardNoticeVO insert(BoardNoticeVO board);
	
	BoardNoticeVO delete(BoardNoticeVO board);
	
	BoardNoticeVO update(BoardNoticeVO board);
}
