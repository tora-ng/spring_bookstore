package edu.kosmo.ysy.vo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Getter
@Setter
public class CustomUserDetails implements UserDetails {
	
	
	//=================================================================================================
	private MemberVO member;	
	// ================================================================================================
	private String password;
	private final String username;
	private final Collection<? extends GrantedAuthority> authorities;
	private final boolean accountNonExpired;
	private final boolean accountNonLocked;
	private final boolean credentialsNonExpired;
	private final boolean enabled;

	// ~ Constructors
	// ===================================================================================================
	
	public CustomUserDetails(MemberVO memberVO) {
		 //Integer.toString(empVO.getEmpno()),getAuth(empVO)
		
		this(memberVO.getUserid(), memberVO.getUserphone(), true, true, true, true, getAuth(memberVO));
		this.member = memberVO;	
	}
	
	public CustomUserDetails(String username, String password, boolean enabled,
			boolean accountNonExpired, boolean credentialsNonExpired,
			boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {

		if (((username == null) || "".equals(username)) || (password == null)) {
			throw new IllegalArgumentException(
					"Cannot pass null or empty values to constructor");
		}

		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.accountNonExpired = accountNonExpired;
		this.credentialsNonExpired = credentialsNonExpired;
		this.accountNonLocked = accountNonLocked;
		this.authorities = authorities;
	}
	
	//유저가 갖고 있는 권한 목록
	public static Collection<? extends GrantedAuthority> getAuth(MemberVO memberVO) { 

		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		
		for (AuthVO auth: memberVO.getAuthList()) {
			authorities.add(new SimpleGrantedAuthority(auth.getAuthority()));
		}
		
		return authorities;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() { return authorities; }

	@Override
	public String getPassword() { return password; }

	@Override
	public String getUsername() {	return username; }

	@Override
	public boolean isAccountNonExpired() {	return accountNonExpired; }

	@Override
	public boolean isAccountNonLocked() {	return accountNonLocked; }

	@Override
	public boolean isCredentialsNonExpired() { return credentialsNonExpired; }

	@Override
	public boolean isEnabled() { return enabled; }

}
