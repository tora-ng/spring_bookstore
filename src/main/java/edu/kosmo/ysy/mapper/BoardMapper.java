package edu.kosmo.ysy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import edu.kosmo.ysy.vo.AuthVO;
import edu.kosmo.ysy.vo.BoardVO;
import edu.kosmo.ysy.vo.MemberVO;

@Mapper
public interface BoardMapper {
	List<BoardVO> getList(int boardtype);
	
	BoardVO read(int bid);
	
	BoardVO insert(BoardVO board);
	
	BoardVO delete(BoardVO board);
	
	BoardVO update(BoardVO board);
}
