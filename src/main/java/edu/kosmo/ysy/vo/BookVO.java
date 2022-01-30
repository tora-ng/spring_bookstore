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
public class BookVO {
	private int bid;
	private String btitle;
	private Timestamp bdate;
	private int bhit;
	private String userid;
	private String bcontent;
	private int bgroup;
	private int bindent;
	private int bstep;
	private int boardtype;
}

//이름         널?       유형             
//---------- -------- -------------- 
//BOOKID     NOT NULL NUMBER         
//BOOKTITLE  NOT NULL VARCHAR2(1500) 
//STOCK      NOT NULL NUMBER         
//BOOKAUTHOR NOT NULL VARCHAR2(1500) 
//BOOKPRICE  NOT NULL NUMBER         
//BOOKPAGE   NOT NULL NUMBER         
//THICKNESS  NOT NULL NUMBER         
//BOOKWEIGHT NOT NULL NUMBER         
//PNAME      NOT NULL VARCHAR2(100)  
//EVENTNO    NOT NULL NUMBER     