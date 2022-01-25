package edu.kosmo.ysy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import edu.kosmo.ysy.vo.AuthVO;
import edu.kosmo.ysy.vo.MemberVO;
import edu.kosmo.ysy.vo.UserVO;

public interface MemberMapper {
	@Select("SELECT * FROM MEMBER WHERE USERID = #{USERID}")
	public MemberVO readUser(String userid);
	
	@Select("select * from authority where userid =  #{USERID}")	
	public List<AuthVO> readAuthority(String userid);
}
