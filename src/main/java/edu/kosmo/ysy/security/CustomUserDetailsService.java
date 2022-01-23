package edu.kosmo.ysy.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import edu.kosmo.ysy.mapper.MemberMapper;
import edu.kosmo.ysy.vo.CustomUser;
import edu.kosmo.ysy.vo.MemberVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class CustomUserDetailsService implements UserDetailsService  {
	
	@Setter(onMethod_ = @Autowired)
	private MemberMapper memberMapper;

	@Override
	public UserDetails loadUserByUsername(String ename) throws UsernameNotFoundException {
		
		log.warn("Load User By Employee number: " + ename);	
		
		MemberVO vo = memberMapper.readUser(ename);
		
		log.warn("queried by EmpVO mapper: " + vo);		
		
		return vo == null ? null : new CustomUser(vo);
		
	}	

}