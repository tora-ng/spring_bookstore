package edu.kosmo.ysy.service;

import javax.inject.Inject;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import edu.kosmo.ysy.mapper.MemberMapper;
import edu.kosmo.ysy.vo.MemberVO;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class MemberService {
	
	@Inject
	private MemberMapper memberMapper;
	
	public MemberVO getUser(String userid){
		log.info("readUser .. ");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String user_id=auth.getName();
		log.info("유저 아이디: " + user_id);
		
		MemberVO memberVO = memberMapper.readMember(userid);
		
		memberVO.setAuthList(memberMapper.readAuthority(userid));
		return memberVO;
	}
	

}