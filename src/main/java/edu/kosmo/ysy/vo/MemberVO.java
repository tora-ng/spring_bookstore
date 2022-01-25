package edu.kosmo.ysy.vo;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@Log4j
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberVO {
	private String userid;
	private String username;
	private String userpassword;
	private String gender;
	private String email;
	private String useradress;
	private String userphone;
	private Timestamp userdate;
	private int mileage;
	
	private List<AuthVO> authList;
	
	
	
}


//이름           널?       유형             
//------------ -------- -------------- 
//USERID       NOT NULL VARCHAR2(1500) 
//USERNAME     NOT NULL VARCHAR2(30)   
//USERPASSWORD NOT NULL VARCHAR2(1500) 
//GENDER       NOT NULL VARCHAR2(15)   
//EMAIL        NOT NULL VARCHAR2(300)  
//USERADRESS   NOT NULL VARCHAR2(1500) 
//USERPHONE    NOT NULL VARCHAR2(50)   
//USERDATE     NOT NULL DATE           
//MILEAGE      NOT NULL NUMBER         
