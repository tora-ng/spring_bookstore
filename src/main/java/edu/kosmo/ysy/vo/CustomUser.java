package edu.kosmo.ysy.vo;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Getter
@Setter
public class CustomUser extends User {
	
	private MemberVO member;
	
	//기본적으로 부모의 생성자를 호출해야만 정상적으로 작동

	public CustomUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
		
	}
	
	public CustomUser(MemberVO memberVO) {
		super(memberVO.getUserid(), memberVO.getUserpassword(),Collections
			    .singletonList(new SimpleGrantedAuthority("ROLE_USER")));
		// TODO Auto-generated constructor stub
		this.member = memberVO;
	}	
}
