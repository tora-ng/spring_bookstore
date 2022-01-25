package edu.kosmo.ysy.mapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import edu.kosmo.ysy.vo.UserVO;
import edu.kosmo.ysy.vo.MemberVO;

@Mapper
public interface UserMapper {
   
   public UserVO getUser(String userid);   
   
   @Insert("INSERT INTO MEMBER VALUES(#{userid}, #{username}, #{userpassword}, #{gender}, #{email}, #{useradress}, #{userphone}, sysdate, 10, 1)")
	public int insertUser(UserVO userVO);

   @Insert("insert into AUTHORITY (userid,AUTHORITY) values(#{userid},'ROLE_USER')")
   public void insertAuthorities(UserVO userVO);

   
}