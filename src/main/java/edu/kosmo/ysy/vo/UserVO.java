package edu.kosmo.ysy.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@Log4j
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserVO {

   private String userId;
   private String userPassword;
   private int enabled;
   
   private List<AuthVO> authList;
}