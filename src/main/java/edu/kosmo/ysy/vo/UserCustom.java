package edu.kosmo.ysy.vo;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Getter
@Setter
public class UserCustom extends User {
	
	@Setter(onMethod_ = @Autowired)
	private UserVO userVO;
	   
	public UserCustom(String userid, String userpassword, Collection<? extends GrantedAuthority> authorities) {
		super(userid, userpassword, authorities);
	}

	public UserCustom(UserVO user) {

		super(user.getUserid(), user.getUserpassword(), getAuth(user));

		this.userVO = user;
	}

	
	
	public static Collection<? extends GrantedAuthority> getAuth(UserVO userVO) {

		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

		for (AuthVO auth : userVO.getAuthList()) {
			authorities.add(new SimpleGrantedAuthority(auth.getAuthority()));
		}

		return authorities;
	}
}
