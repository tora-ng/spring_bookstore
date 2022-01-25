package edu.kosmo.ysy.vo;

import java.sql.Timestamp;
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

   private String userid;
   private String username;
   private String userpassword;
   private String gender;
   private String email;
   private String useradress;
   private String userphone;
   private Timestamp date;
   private int mileage;   
   private int enabled;
   
   private List<AuthVO> authList;
}

//USERID       NOT NULL VARCHAR2(1500) 
//USERNAME              VARCHAR2(30)   
//USERPASSWORD NOT NULL VARCHAR2(1500) 
//GENDER                VARCHAR2(15)   
//EMAIL                 VARCHAR2(300)  
//USERADRESS            VARCHAR2(1500) 
//USERPHONE             VARCHAR2(50)   
//USERDATE              DATE           
//MILEAGE               NUMBER         
//ENABLED               NUMBER 