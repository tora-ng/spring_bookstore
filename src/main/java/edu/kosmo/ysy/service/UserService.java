//package edu.kosmo.ysy.service;
//
//import javax.inject.Inject;
//
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import edu.kosmo.ysy.mapper.MemberMapper;
//import edu.kosmo.ysy.mapper.UserMapper;
//import edu.kosmo.ysy.vo.MemberVO;
//import edu.kosmo.ysy.vo.UserVO;
//import lombok.NoArgsConstructor;
//import lombok.extern.log4j.Log4j;
//
//@Log4j
//@NoArgsConstructor
//@Service
//public class UserService {
//
//   @Inject
//   private BCryptPasswordEncoder passEncoder;
//
//   @Inject
//   private MemberMapper memberMapper;
//
//   //@Transactional(rollbackFor = Exception.class)
//   public void addUser(MemberVO memberVO) {
//     
//	  String password = memberVO.getUserpassword();
//      String encode = passEncoder.encode(password);
//
//      memberVO.setUserpassword(encode);
//
//      memberMapper.insertUser();
//      memberMapper.insertAuthorities(memberVO);
//   }
//}