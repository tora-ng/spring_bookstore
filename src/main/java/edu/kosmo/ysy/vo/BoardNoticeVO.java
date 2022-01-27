package edu.kosmo.ysy.vo;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class BoardNoticeVO {
	private int bid;
	private String btitle;
	private Timestamp bdate;
	private int bhit;
	private String userid;
	private String bcontent;
	private int bgroup;
	private int bindent;
	private int bstep;
}

//이름       널?       유형             
//-------- -------- -------------- 
//BID      NOT NULL NUMBER         
//BTITLE   NOT NULL VARCHAR2(60)   
//BDATE    NOT NULL DATE           
//BHIT     NOT NULL NUMBER         
//USERID   NOT NULL VARCHAR2(1500) 
//BCONTENT          VARCHAR2(1000) 
//BGROUP            NUMBER         
//BINDENT           NUMBER         
//BSTEP             NUMBER   