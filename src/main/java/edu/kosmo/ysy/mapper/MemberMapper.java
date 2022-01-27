package edu.kosmo.ysy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import edu.kosmo.ysy.vo.AuthVO;
import edu.kosmo.ysy.vo.MemberVO;

public interface MemberMapper {
	@Select("SELECT * FROM member, authority where member.userid = authority.userid and member.userid = #{USERID}")
	public MemberVO readMember(String userid);
	
	@Select("SELECT authority, userid FROM member, authority where member.userid = authority.userid and member.userid = #{USERID}")	
	public List<AuthVO> readAuthority(String userid);
	
	@Insert("insert into member(userid,userpassword) values(#{userid},#{userpassword})")
	public int insertMember(MemberVO memberVO);
	
	
}
