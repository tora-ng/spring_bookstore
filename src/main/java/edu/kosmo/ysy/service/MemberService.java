package edu.kosmo.ysy.service;

import javax.inject.Inject;

import org.springframework.security.crypto.password.PasswordEncoder;

import edu.kosmo.ysy.mapper.MemberMapper;
import edu.kosmo.ysy.vo.MemberVO;
import lombok.extern.log4j.Log4j;

@Log4j
public class MemberService {

	@Inject
	private MemberMapper memberMapper;
	
	public MemberVO getUser(String userid){
		log.info("userid .. ");
		
		return memberMapper.readUser(userid);
	}

}