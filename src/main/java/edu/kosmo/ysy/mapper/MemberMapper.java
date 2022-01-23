package edu.kosmo.ysy.mapper;

import org.apache.ibatis.annotations.Select;

import edu.kosmo.ysy.vo.MemberVO;

public interface MemberMapper {
	@Select("SELECT * FROM MEMBER WHERE USERID = #{USERID}")
	public MemberVO readUser(String name);
}
