package edu.kosmo.ysy.service;

import javax.inject.Inject;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.kosmo.ysy.mapper.UserMapper;
import edu.kosmo.ysy.vo.UserVO;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@NoArgsConstructor
@Service
public class UserService {

	// 암호화 모듈
	@Inject
	private BCryptPasswordEncoder passEncoder;

	@Inject
	private UserMapper userMapper;

	@Transactional(rollbackFor = Exception.class)
	public void addUser(UserVO userVO) {
		String password = userVO.getUserpassword();
		String encode = passEncoder.encode(password);

		userVO.setUserpassword(encode);

		userMapper.insertUser(userVO);
		userMapper.insertAuthorities(userVO);
	}
}
